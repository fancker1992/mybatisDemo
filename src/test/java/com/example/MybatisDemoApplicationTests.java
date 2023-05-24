package com.example;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserList() {
        List<User> userList = userMapper.list();
        for (User user : userList) {
            System.out.println(user.getName());
        }
    }

}
