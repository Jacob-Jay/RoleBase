package com.order.work.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:43
 */
@Mapper
@Repository
public interface AccessMapper {

    @Select( value = "select ac.url,ac.method,role.role from access ac join access_role ar" +
            " on ar.access_id = ac.id and ac.`status` = ${@com.order.enums.StatusEnum@ENABLE.getCode()}" +
            " join role on role.id = ar.role_id and role.`status` = ${@com.order.enums.StatusEnum@ENABLE.getCode()}"
            )
    List<Map<String,String>> getAllAcRoles();
}
