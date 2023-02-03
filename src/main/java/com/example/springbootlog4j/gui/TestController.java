package com.example.springbootlog4j.gui;

import com.example.springbootlog4j.gui.orgnization.entity.User;
import com.example.springbootlog4j.gui.orgnization.service.UserService;
import com.example.springbootlog4j.gui.util.RandomValue;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @RequestMapping(value = "batchSomeUser")
    public List<User> batchSomeUser(@Param("id") String is){

        logger.info("进入testController中的batchSomeUser方法;参数id="+is);

        List<User> batchUserList = new ArrayList<>();
        for (int i = 0;i < 10;i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString().replaceAll("-",""));
            user.setTel(RandomValue.getTel());
            user.setEmail(RandomValue.getEmail(10,20));
            String realName = RandomValue.getChineseName();
            String userName = RandomValue.toPinyin(realName);
            user.setCreator(userName);
            user.setRealname(realName);
            user.setUsername(userName);
            user.setPassword("123456");
            user.setCreateTime(new Date());
            user.setUpdater(userName);
            user.setUpdateTime(new Date());
            batchUserList.add(user);
        }

        try {
            userService.batchUser(batchUserList);
        } catch (Exception e) {
            logger.error(e);
        }
        return batchUserList;
    }
}
