package springalibaba.hebr.provider.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @class NacosSpringApplication
 * @date 2021/3/8:22:25
 * @decs TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringApplication.class,args);
    }
}
