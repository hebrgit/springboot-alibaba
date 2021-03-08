package cloud.provider.order7001.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @class FeignConfig
 * @date 2021/3/7:0:06
 * @decs TODO
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerConfig(){
        return Logger.Level.FULL;
    }

}
