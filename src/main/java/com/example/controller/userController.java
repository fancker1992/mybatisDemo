package com.example.controller;

import com.example.mapper.UserMapper;
import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getuser")
    public Result getUserList() {

        List<User> list = userMapper.list();
        return Result.success(list);

    }

}
