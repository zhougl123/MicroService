package com.atguigu.springcloud.cfgbeans;

import com.atguigu.myrule.RandomRule_ZY;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myIRule(){
        //oooooooooooo
        //12121212121
        //jkjkjkjkjj
        //测试git到githup远程库的提交//
        //return new RoundRobinRule();//重新配置负载均衡算法
        //return new RandomRule();//随机负载均衡算法
        return new RetryRule();
    }
}
