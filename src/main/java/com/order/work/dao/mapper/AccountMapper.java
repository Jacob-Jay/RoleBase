package com.order.work.dao.mapper;

import com.order.work.dao.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:42
 */
@Mapper
@Repository
public interface AccountMapper {



    @Select(value = {"select * from account where account_name = #{accountName} and status = ${@com.order.enums.StatusEnum@ENABLE.getCode()}"})
    Account getByName(String accountName);
}
