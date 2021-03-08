package spring.hebr.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import spring.hebr.hystrix.service.HystrixPaymentService;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @class HystrixOrderController
 * @date 2021/3/7:16:22
 * @decs TODO
 */
@RestController
//@DefaultProperties(defaultFallback = "globalException")
public class HystrixOrderController {



    @Resource
    private HystrixPaymentService service;

    //降级测试
    @GetMapping("/consumer/requestOk")
    public String requestOk(){

        return service.requestOk();
    }


    @GetMapping("/consumer/requestTimeout")
    @HystrixCommand(fallbackMethod = "globalException")
    public String requestTimeout(){

      return service.requestTimeout();
    }

    public String globalException(){
        return "全局处理超时方法";
    }


    //熔断测试

    @GetMapping("/consumer/requestCircuitbreaker/{id}")
    @HystrixCommand(fallbackMethod = "requestCircuitbreaker_fallback",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//错误率


    })
    public String requestCircuitbreaker(@PathVariable("id") String id){

        if (id .equals("1")){

            System.out.println(id);
            throw  new RuntimeException();
        }
        return "熔断测试";
    }


    public String requestCircuitbreaker_fallback(@PathVariable("id") String id){


        return "熔断测试回调方法";
    }
}
