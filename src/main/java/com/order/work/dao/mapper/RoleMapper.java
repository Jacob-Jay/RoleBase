package com.order.work.dao.mapper;

import com.order.work.dao.domain.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:42
 */
@Mapper
@Repository
public interface RoleMapper {

    @Select("SELECT role.* from account_role ar join role on ar.role_id = role.id " +
            " and role.`status` = ${@com.order.enums.StatusEnum@ENABLE.getCode()} " +
            "where ar.account_id = ${@com.order.enums.StatusEnum@ENABLE.getCode()}")
    List<Role> getByAccountId(Long id);
}
