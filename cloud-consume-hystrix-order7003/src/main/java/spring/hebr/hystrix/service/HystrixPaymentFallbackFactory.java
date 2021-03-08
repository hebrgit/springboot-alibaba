package spring.hebr.hystrix.service;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @class HystrixPaymentFallbackFactory
 * @date 2021/3/7:19:10
 * @decs TODO
 */
@Component
public class HystrixPaymentFallbackFactory implements FallbackFactory<HystrixPaymentFallback> {
    @Override
    public HystrixPaymentFallback create(Throwable cause) {
        return new HystrixPaymentFallback();
    }
}
