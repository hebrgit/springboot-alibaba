package spring.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @class ConsulProviderSpringApplication
 * @date 2021/3/6:15:03
 * @decs TODO
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProviderSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProviderSpringApplication.class,args);
    }
}
