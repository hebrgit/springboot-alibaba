package cloud.provider.order7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @class Order01SpringBootApplication
 * @date 2021/3/5:22:06
 * @decs TODO
 */
@SpringBootApplication
@EnableEurekaClient
public class Order01SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Order01SpringBootApplication.class, args);
    }
}
