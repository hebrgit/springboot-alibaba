package spring.hebr.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @class HystrixPaymentService
 * @date 2021/3/7:16:22
 * @decs TODO
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallbackFactory = HystrixPaymentFallbackFactory.class)
@Component
public interface HystrixPaymentService {

    @GetMapping("/provider/requestOk")
     String requestOk();


    @GetMapping("/provider/requestTimeout")
     String requestTimeout();
}
