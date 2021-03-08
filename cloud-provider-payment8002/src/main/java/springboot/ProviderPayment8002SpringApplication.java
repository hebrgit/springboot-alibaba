package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @class ProviderPayment8002SpringApplication
 * @date 2021/3/6:12:17
 * @decs TODO
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderPayment8002SpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderPayment8002SpringApplication.class,args);
    }
}
