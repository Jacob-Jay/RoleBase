package com.security.custom.security.access;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 9:07
 * 没有认证访问受控制资源处理
 */
@Component("customAuthenticationEntryPoint")
public class NotAuthenticationedHandler  implements AuthenticationEntryPoint{
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.sendRedirect("/valid/notAuthentication");
    }
}
