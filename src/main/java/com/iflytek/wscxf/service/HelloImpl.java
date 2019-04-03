package com.iflytek.wscxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Date;

/**
 * @Author: zsxu2
 * @Date 2019/3/22 10:22
 */
@javax.jws.WebService(serviceName = "HelloService", portName = "HelloPort",
        targetNamespace = "http://service.ws.sample/")
public class HelloImpl implements Hello {
    @Override
    @WebMethod(action = "sayHello")
    public String sayHello(@WebParam(name = "name") String name) {
        System.out.println("req sayHello at " + new Date().toLocaleString());
        return "Hello, " + name;
    }

    @Override
    @WebMethod(action = "sayHi")
    public String sayHi(@WebParam(name = "name")String name) {
        System.out.println("req sayHi at " + new Date().toLocaleString());
        return "Hi, " + name;
    }

    @Override
    @WebMethod(action = "sayNihao")
    public String sayNihao(@WebParam(name = "name")String name) {
        System.out.println("req sayNihao at " + new Date().toLocaleString());
        return "你好, " + name;
    }
}
