package com.yajun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 *
 * 功能描述: eurekaServer 集群第三台注册中心
 *
 * @param:
 * @return:
 * @auther: zyj
 * @date: 2020/6/20 22:24
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7003.class, args);
    }
}
