package com.security.custom.security.access;

import com.order.work.service.AccessService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 20:05
 */
@Component("customFilterInvocationMetaSource")
public class CustomFilterInvocationMetaSource implements FilterInvocationSecurityMetadataSource,InitializingBean {

    @Autowired
    private AccessService accessService;


    private final Object configLock = new Object();

    private Map<String,Map<String,Collection<ConfigAttribute>>> urlMethodRoles = new HashMap<>();
    private Map<String,Map<String,Collection<ConfigAttribute>>> tempUrlMethodRoles = new HashMap<>();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        if (object == null || !supports(object.getClass())) {
            throw new IllegalArgumentException("argument must be filterInvocation");
        }
        FilterInvocation filterInvocation = (FilterInvocation) object;
        String requestUrl = filterInvocation.getRequestUrl();
        requestUrl = getRealUrl(requestUrl);
        String method = filterInvocation.getRequest().getMethod();
        return findAttributes(requestUrl,method);
    }

    private Collection<ConfigAttribute> findAttributes(String requestUrl, String method) {


        Map<String, Collection<ConfigAttribute>> methodRolesMap = urlMethodRoles.get(requestUrl.toUpperCase());

        if (methodRolesMap == null) {
            return null;
        }

        return methodRolesMap.get(method.toLowerCase());
    }

    /**
     *
     * @param requestUrl 请求url
     * @return 用于匹配权限的url
     */
    private String getRealUrl(String requestUrl) {
        //派出参数部分
        int i = requestUrl.indexOf("?");
        if (i != -1) {
            requestUrl = requestUrl.substring(0, i);
        }

        if (requestUrl.endsWith("/") && requestUrl.length() > 1) {
            requestUrl = requestUrl.substring(0, requestUrl.length() - 1);
        }

        return requestUrl;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        Set<ConfigAttribute> configAttributes = new HashSet<>();
        for (Map.Entry<String, Map<String, Collection<ConfigAttribute>>> entry : urlMethodRoles.entrySet()) {
            for (Collection<ConfigAttribute> o : entry.getValue().values()) {
                configAttributes.addAll(o);
            }
        }
        return configAttributes;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return FilterInvocation.class.isAssignableFrom(clazz);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        synchronized (configLock) {
            try {
                tempUrlMethodRoles.clear();
                loadConfig();
                urlMethodRoles = tempUrlMethodRoles;
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
    }

    /**
     * 从数据加载路径 角色关系
     */
    private void loadConfig() {
      List<Map<String,String>> acRoles =   accessService.getAllAcRoles();
        if (CollectionUtils.isEmpty(acRoles)) {
            return;
        }
        for (Map<String, String> acRole : acRoles) {
            String url = acRole.get("url").toUpperCase();
            String method = acRole.get("method");
            String role = acRole.get("role");
            Map<String, Collection<ConfigAttribute>> methodRolesMap = tempUrlMethodRoles.get(url);
            if (methodRolesMap == null) {
                methodRolesMap = new HashMap<>();
            }
            Collection<ConfigAttribute> list = methodRolesMap.get(method);
            if (list == null) {
                list = new HashSet<>();
            }

            list.add(new SecurityConfig(role));


            methodRolesMap.put(method, list);
            tempUrlMethodRoles.put(url, methodRolesMap);

        }
    }
}
