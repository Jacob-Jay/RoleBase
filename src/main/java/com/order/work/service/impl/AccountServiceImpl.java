package com.order.work.service.impl;

import com.order.work.dao.domain.Account;
import com.order.work.dao.mapper.AccountMapper;
import com.order.work.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:46
 * 账号相关service
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getByName(String accountName) {
        return accountMapper.getByName(accountName);
    }
}
