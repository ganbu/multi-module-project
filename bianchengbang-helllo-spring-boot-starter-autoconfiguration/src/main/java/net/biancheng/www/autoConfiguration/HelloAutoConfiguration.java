package net.biancheng.www.autoConfiguration;

import net.biancheng.www.properties.HelloProperties;
import net.biancheng.www.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置类
@Configuration
// 为helloProperties.class 开启属性配置功能 并将这个类以组件的形式注入到容器 中
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    // 当容器中没有指定类时 该方法才会生效
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
