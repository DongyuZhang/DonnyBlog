package com.gwu.donny.mapper;

import com.gwu.donny.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User findUserInfo();
}
