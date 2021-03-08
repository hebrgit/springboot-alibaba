package spring.hebr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Administrator
 * @class CloudZookpperSpringApplication
 * @date 2021/3/6:14:04
 * @decs TODO
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CloudZookeeperSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudZookeeperSpringApplication.class,args);
    }
}
