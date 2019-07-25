package com.order.work.service.impl;

import com.order.work.dao.mapper.AccessMapper;
import com.order.work.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:47
 * 权限控制service
 */
@Service
public class AccessServiceImpl implements AccessService {

    @Autowired
    private AccessMapper accessMapper;

    @Override
    public List<Map<String, String>> getAllAcRoles() {
        return accessMapper.getAllAcRoles();
    }
}
