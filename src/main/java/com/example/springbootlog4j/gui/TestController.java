package com.example.springbootlog4j.gui;

import com.example.springbootlog4j.gui.orgnization.entity.User;
import com.example.springbootlog4j.gui.orgnization.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author gql
 * @Date 2023/2/2 17:36
 **/
@RestController
@RequestMapping("/testController")
public class TestController {

    private static final Logger logger = Logger.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        logger.info("进入testController中test方法");
        return "1";
    }

    @RequestMapping("/getUsers")
    public List<User> getAllUsers(){
        logger.info("进入testController中getUsers方法");
        return userService.getAllUsers();
    }
}
