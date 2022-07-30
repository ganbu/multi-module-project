package net.biancheng.www.service;

import net.biancheng.www.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName){
        return helloProperties.getPrefix()+userName+helloProperties.getSuffix();
    }

}
