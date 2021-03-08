package cloud.provider.order7001.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Administrator
 * @class MyApplicationConfiguration
 * @date 2021/3/5:22:01
 * @decs TODO
 */
@Configuration
public class MyApplicationConfiguration {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
