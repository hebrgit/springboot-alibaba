package spring.hebr.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @class PayControllerHystrix
 * @date 2021/3/7:14:54
 * @decs TODO
 */
@RestController
public class PayControllerHystrix {

    @GetMapping("/provider/requestOk")
    public String requestOk(){

        return "请求成功";
    }


    @GetMapping("/provider/requestTimeout")
//    @HystrixCommand(fallbackMethod = "requestTimeout_fallback",commandProperties= {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
//    })
    public String requestTimeout(){

//      int age =  10/0;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "请求成功，耗时："+5000;
    }

    public String requestTimeout_fallback(){

        return "请稍后重试";
    }
}
