package com.security.custom.security.access;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 19:59
 * 自定义权限拦截器
 */
@Component("customFilterInterceptor")
public class AccessFilter extends AbstractSecurityInterceptor implements Filter ,InitializingBean{

    @Autowired
    @Qualifier("customAccessManager")
    private AccessDecisionManager accessDecisionManager;

    @Autowired
    @Qualifier("customFilterInvocationMetaSource")
    private FilterInvocationSecurityMetadataSource metadataSource;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FilterInvocation fi = new FilterInvocation(request, response, chain);
        invoke(fi);
    }

    public void invoke(FilterInvocation fi) throws IOException, ServletException {
        InterceptorStatusToken token = super.beforeInvocation(fi);
        try {
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } finally {
            super.afterInvocation(token, null);
        }
    }

    @Override
    public void destroy() {

    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return metadataSource;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        super.setAccessDecisionManager(accessDecisionManager);
        super.afterPropertiesSet();
    }
}
