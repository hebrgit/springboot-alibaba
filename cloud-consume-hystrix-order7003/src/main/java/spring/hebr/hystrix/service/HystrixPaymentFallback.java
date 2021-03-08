package spring.hebr.hystrix.service;

import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @class HystrixPaymentFallback
 * @date 2021/3/7:18:46
 * @decs TODO
 */
@Component
public class HystrixPaymentFallback implements HystrixPaymentService {
    @Override
    public String requestOk() {
        return "HystrixPaymentFallback ==> requestOk()";
    }

    @Override
    public String requestTimeout() {
        return "HystrixPaymentFallback ==> requestTimeout()";
    }
}
