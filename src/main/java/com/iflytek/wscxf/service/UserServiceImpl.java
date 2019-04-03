package com.iflytek.wscxf.service;

import com.iflytek.wscxf.entiy.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;

/**
 * @Author: zsxu2
 * @Date 2019/3/27 10:39
 */
@WebService(serviceName = "userService", portName = "userServicePort")
public class UserServiceImpl implements UserService {

    @Override
    @WebMethod(action = "queryUser")
    public User queryUser(@WebParam(name = "user") User userParam) {
        System.out.println("req queryUser at " + new Date().toLocaleString());
        User user = new User();
        user.setId(userParam.getId());
        user.setName(userParam.getName());
        return user;
    }
}
