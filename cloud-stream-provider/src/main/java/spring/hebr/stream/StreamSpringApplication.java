package spring.hebr.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @class StreamSpringApplication
 * @date 2021/3/8:20:29
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamSpringApplication {


    public static void main(String[] args) {
        SpringApplication.run(StreamSpringApplication.class,args);
    }
}
