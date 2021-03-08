package spring.hebr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @class EuarkaServerApplication
 * @date 2021/3/5:23:20
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication6001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication6001.class,args);
    }
}
