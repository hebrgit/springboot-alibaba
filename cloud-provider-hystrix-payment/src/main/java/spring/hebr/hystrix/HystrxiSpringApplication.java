package spring.hebr.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Administrator
 * @class HystrxiSpringApplication
 * @date 2021/3/7:15:00
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrxiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrxiSpringApplication.class,args);
    }
}
