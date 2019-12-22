package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select *  from user where id=#{id}")
    User findUserById(int id);
}
