package com.order.work.service.impl;

import com.order.work.dao.domain.RememberMe;
import com.order.work.dao.mapper.RememberMeMapper;
import com.order.work.service.RememberMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:48
 * 记住功能相关service
 */
@Service
public class RememberMeServiceImpl implements RememberMeService{
    @Autowired
    private RememberMeMapper rememberMeMapper;

    @Transactional
    @Override
    public void create(PersistentRememberMeToken token) {
        rememberMeMapper.create(token);
    }

    @Transactional
    @Override
    public void update(String series, String tokenValue, Date lastUsed) {
        rememberMeMapper.update(series,tokenValue,lastUsed);
    }

    @Override
    public RememberMe get(String seriesId) {
        return rememberMeMapper.get(seriesId);
    }

    @Transactional
    @Override
    public void del(String username) {
        rememberMeMapper.delByName(username);
    }
}
