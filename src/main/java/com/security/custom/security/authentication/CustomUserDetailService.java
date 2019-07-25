package com.security.custom.security.authentication;

import com.order.work.dao.domain.Account;
import com.order.work.dao.domain.Role;
import com.order.work.service.AccountService;
import com.order.work.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:59
 * 定制化获取用户信息
 */
@Component
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private AccountService accountService;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String accountName) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(accountName)) {
            return  null;
        }
        Account account = accountService.getByName(accountName);
        if (account == null) {
            return null;
        }
        List<Role> roles = roleService.getByAccountId(account.getId());

        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getRole());
            authorities.add(grantedAuthority);
        }

        UserDetails userDetails = new User(accountName,account.getPassword(),authorities);
        return userDetails;
    }
}
