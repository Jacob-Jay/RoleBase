package com.security.custom.security.access;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 20:06
 * 自定义权限决定器
 */
@Component("customAccessManager")
public class CustomAccessManager implements AccessDecisionManager {
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (ConfigAttribute configAttribute : configAttributes) {
            if (configAttribute instanceof SecurityConfig) {
                String attribute = configAttribute.getAttribute();
                for (GrantedAuthority authority : authorities) {
                    String authority1 = authority.getAuthority();
                    if (authority1.equals(attribute)) {
                        return;
                    }
                }
            } else {
                throw new AccessDeniedException("custom manager only accept securityConfig");
            }
        }
        throw new AccessDeniedException("access defined");
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
