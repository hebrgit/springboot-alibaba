package com.hebr.stoarge;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.apache.catalina.Store;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @class StorageSpringApplication
 * @date 2021/3/13:12:06
 * @decs TODO
 */
@SpringBootApplication
@EnableFeignClients
public class StorageSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageSpringApplication.class,args);
    }
}
