package com.hebr.ordero1;

import cn.hutool.db.sql.Order;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @class Order01SpringApplication
 * @date 2021/3/13:12:02
 * @decs TODO
 */
@SpringBootApplication
@EnableFeignClients
public class Order01SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order01SpringApplication.class,args);
    }
}
