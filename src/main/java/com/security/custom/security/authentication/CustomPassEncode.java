package com.security.custom.security.authentication;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 17:28
 */
public class CustomPassEncode implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return rawPassword.toString().equals(encodedPassword);
    }
}
