package cloud.provider.order7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Administrator
 * @class Order01SpringBootApplication
 * @date 2021/3/5:22:06
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Order02SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order02SpringBootApplication.class, args);
    }
}
