package com.chen.demo;

import com.chen.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(basePackages = "com.chen.demo.mapper")
class DemoApplicationTests {
@Autowired
private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    void add() {
        User user = new User();
        user.setName("Jack");
        userMapper.insert(user);
        System.out.println(user.getId());
    }

}
