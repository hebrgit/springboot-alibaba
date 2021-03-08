package spiring.hebo.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName ConfigClientSpringApplication
 * @Author hebo
 * @Date 2021/3/8 13:33
 **/
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientSpringApplication.class,args);
    }
}
