package com.leo.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configBean {
    @Bean
    @LoadBalanced   //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端   负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /***
     * 如果入口类上加了@RibbonClient注解，就不要在这个地方再写方法，否则会报错
     */
//    @Bean
//    public IRule myLoadBalanceRule(){
//        return new RandomRule();//用我们重新选择的随机算法替代默认的轮询
//    }
}
