package spirng.hebr.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaSpingApplication6003
 * @Author hebo
 * @Date 2021/3/8 9:53
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaSpringApplication6003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringApplication6003.class, args);
    }
}
