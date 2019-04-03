package com.iflytek.wscxf.config;

import com.iflytek.wscxf.service.HelloImpl;
import com.iflytek.wscxf.service.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @Author: zsxu2
 * @Date 2019/3/22 10:13
 */
@Configuration
public class WebServiceConfig {
    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new HelloImpl());
        endpoint.publish("/Hello");
        return endpoint;
    }

    @Bean
    public Endpoint endpoint2() {
        EndpointImpl endpoint = new EndpointImpl(bus, new UserServiceImpl());
        endpoint.publish("/User");
        return endpoint;
    }
}
