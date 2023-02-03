package com.example.springbootlog4j.gui.orgnization.service.impl;

import com.example.springbootlog4j.gui.orgnization.entity.User;
import com.example.springbootlog4j.gui.orgnization.mapper.UserMapper;
import com.example.springbootlog4j.gui.orgnization.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author gql
 * @Date 2023/2/3 16:15
 **/
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUser();
    }

    @Override
    public void batchUser(List<User> batchUserList) {
        userMapper.batchUser(batchUserList);
    }
}
