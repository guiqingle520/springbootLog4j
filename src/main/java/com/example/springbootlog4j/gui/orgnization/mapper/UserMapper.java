package com.example.springbootlog4j.gui.orgnization.mapper;

import com.example.springbootlog4j.gui.orgnization.dto.UserDto;
import com.example.springbootlog4j.gui.orgnization.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();

    void batchUser(List<User> batchUserList);
}
