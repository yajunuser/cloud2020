package com.yajun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * 功能描述: 服务提供端 提供创建订单，查询订单功能
 *
 * @param:
 * @return:
 * @auther: zyj
 * @date: 2020/6/14 16:10
 */
@SpringBootApplication
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
    }
}