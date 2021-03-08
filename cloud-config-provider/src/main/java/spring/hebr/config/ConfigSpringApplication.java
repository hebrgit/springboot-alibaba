package spring.hebr.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigSpringApplication
 * @Author hebo
 * @Date 2021/3/8 9:59
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableConfigServer
public class ConfigSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSpringApplication.class, args);
    }
}
