package com.order.work.service.impl;

import com.order.work.dao.domain.Role;
import com.order.work.dao.mapper.RoleMapper;
import com.order.work.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:47
 * 角色相关service
 */
@Service
public class RoleServiceImpl  implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getByAccountId(Long id) {
        return roleMapper.getByAccountId(id);
    }
}
