package com.example.springbootlog4j.gui.orgnization.service;

import com.example.springbootlog4j.gui.orgnization.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void batchUser(List<User> batchUserList);
}
