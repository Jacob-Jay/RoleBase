package com.order.work.service;

import com.order.work.dao.domain.RememberMe;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;

import java.util.Date;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:48
 */
public interface RememberMeService {
    void create(PersistentRememberMeToken token);

    void update(String series, String tokenValue, Date lastUsed);

    RememberMe get(String seriesId);

    void del(String username);
}
