package com.mu.hellodubboserviceuserprovider.api.impl;

import com.mu.hello.dubbo.service.user.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Override
    public String sayHi() {
        return "hello Dubbo";
    }
}
