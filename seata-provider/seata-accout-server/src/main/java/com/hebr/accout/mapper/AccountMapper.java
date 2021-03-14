package com.hebr.accout.mapper;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * @class AccountMapper
 * @date 2021/3/13:11:49
 * @decs TODO
 */
@Mapper
public interface AccountMapper {
    void debit(@Param("userId") String userId, @Param("money") int money);

    Integer getMoney(@Param("userId") String userId);
}
