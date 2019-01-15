package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyselfRule {
    @Bean
    public IRule myIRule(){
        //return new RoundRobinRule();//重新配置负载均衡算法
        //return new RandomRule();//随机负载均衡算法
        return new RandomRule_ZY();
    }
}
