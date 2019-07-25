package com.security.custom.security.rememberMe;

import com.order.work.dao.domain.RememberMe;
import com.order.work.service.RememberMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-25 11:15
 * 记住我自定义数据处理
 */
@Component("customPersistentTokenRepository")
public class CustomPersistentTokenRepository implements PersistentTokenRepository{
    @Autowired
    private RememberMeService rememberMeService;

    @Override
    public void createNewToken(PersistentRememberMeToken token) {
        rememberMeService.create(token);
    }

    @Override
    public void updateToken(String series, String tokenValue, Date lastUsed) {
        rememberMeService.update(series,tokenValue,lastUsed);
    }

    @Override
    public PersistentRememberMeToken getTokenForSeries(String seriesId) {
        RememberMe rememberMe = rememberMeService.get(seriesId);
        PersistentRememberMeToken token = new PersistentRememberMeToken(
                rememberMe.getAccountName(),rememberMe.getId(),
                rememberMe.getToken(),rememberMe.getLastUsed()
        );
        return token;
    }

    @Override
    public void removeUserTokens(String username) {
        rememberMeService.del(username);
    }
}
