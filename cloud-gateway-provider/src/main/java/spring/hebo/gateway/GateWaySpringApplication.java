package spring.hebo.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @class GateWaySpringApplication
 * @date 2021/3/7:22:43
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWaySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(GateWaySpringApplication.class,args);
    }
}
