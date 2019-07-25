package com.order.work.service;

import com.order.work.dao.domain.Role;

import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:47
 */
public interface RoleService {
    List<Role> getByAccountId(Long id);
}
