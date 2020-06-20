package com.yajun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 *
 * 功能描述: 使用HTTPClient 方式实现服务间的相互调用
 *
 * @param:
 * @return:
 * @auther: zyj
 * @date: 2020/6/14 21:26
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
