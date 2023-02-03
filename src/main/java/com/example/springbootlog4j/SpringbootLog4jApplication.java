package com.example.springbootlog4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLog4jApplication {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(SpringbootLog4jApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLog4jApplication.class, args);
        logger.info("测试info");
        logger.warn("测试warn");
        logger.error("测试error");
    }

}
