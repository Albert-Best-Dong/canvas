package com.imooc.icanvas.dao;

import com.imooc.icanvas.entity.Account;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account where name=#{name}")
    @Results(value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "password", property = "password")}
    )
    List<Account> selectByName(String name);
}
