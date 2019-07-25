package com.order.work.service;

import com.order.work.dao.domain.Account;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:46
 */
public interface AccountService {
    Account getByName(String accountName);
}
