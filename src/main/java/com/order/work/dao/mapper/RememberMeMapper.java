package com.order.work.dao.mapper;

import com.order.work.dao.domain.RememberMe;
import org.apache.ibatis.annotations.*;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-07-24 16:43
 *
 * security记住我mapper
 */
@Mapper
@Repository
public interface RememberMeMapper {


    @Insert("INSERT INTO `remember_me` (`account_name`, `id`, `token`, `last_used`) " +
            "VALUES (#{token.username}, #{token.series}, #{token.tokenValue}, #{token.date});")
    void create(@Param("token") PersistentRememberMeToken token);

    @Update("update remember_me set token = #{token},last_used = #{dateTime} where id = #{id} ")
    void update(@Param("id") String series, @Param("token") String tokenValue,@Param("dateTime") Date lastUsed);

    @Select("select * from remember_me where id = #{seriesId}")
    RememberMe get(String seriesId);

    @Delete("delete  from remember_me where account_name = #{username} ")
    void delByName(String username);
}
