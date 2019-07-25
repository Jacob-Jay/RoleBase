package com.security.config;

import com.security.custom.security.authentication.CustomPassEncode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.servlet.Filter;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 14:56
 */
@EnableWebSecurity
@ComponentScan(value = {"com.security.custom.security"})
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    //authentication
    @Autowired
    private UserDetailsService customUserDetailService;
    @Autowired
    private AuthenticationFailureHandler failHandler;
    @Autowired
    private AuthenticationSuccessHandler successHandler;


    //rememberMe
    @Autowired
    @Qualifier("customPersistentTokenRepository")
    private PersistentTokenRepository persistentTokenRepository;

    //access
    @Autowired
    private AccessDeniedHandler accessDeniedHandler;
    @Autowired
    @Qualifier("customAuthenticationEntryPoint")
    private AuthenticationEntryPoint authenticationEntryPoint;

    //logout
    @Autowired
    @Qualifier("customLogoutHandler")
    private LogoutSuccessHandler logoutSuccessHandler;


    //customFilter
    @Autowired
    @Qualifier("customFilterInterceptor")
    private Filter accessfilter;


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailService).passwordEncoder(new CustomPassEncode());
    }


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //表单登录
        http.formLogin().usernameParameter("username").passwordParameter("password")
                .loginPage("/").loginProcessingUrl("/login/DoLogin")
                .failureHandler(failHandler).successHandler(successHandler).permitAll();

        //记住我
        http.rememberMe().rememberMeParameter("remember-me").userDetailsService(userDetailsService())
                .tokenRepository(persistentTokenRepository);


        //非法处理全部放行
        http.authorizeRequests().antMatchers("/valid/**","/favicon.ico","/login").permitAll();
        //需要认证才能访问
        http.authorizeRequests().antMatchers("/**").authenticated();

        //认证异常
        http.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
        http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint);

        //登出操作
        http.logout().logoutUrl("/logout").logoutSuccessHandler(logoutSuccessHandler);


        http.addFilterBefore(accessfilter, FilterSecurityInterceptor.class);
    }


}
