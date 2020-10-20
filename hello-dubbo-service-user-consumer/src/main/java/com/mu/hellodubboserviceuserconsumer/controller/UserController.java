package com.mu.hellodubboserviceuserconsumer.controller;

import com.mu.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(version = "1.0.0")
    private UserService userService;

    @GetMapping("/getMsg")
    public String getMsg(){
        return userService.sayHi();
    }

}
