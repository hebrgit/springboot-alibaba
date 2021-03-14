package com.hebr.accout;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @class AccoutSpringApplication
 * @date 2021/3/13:11:31
 * @decs TODO
 */
@SpringBootApplication
@EnableFeignClients
public class AccountSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountSpringApplication.class,args);
    }
}
