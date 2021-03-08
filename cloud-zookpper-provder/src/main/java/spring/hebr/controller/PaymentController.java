package spring.hebr.controller;

import cloud.common.provider.response.ResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Administrator
 * @class PaymentController
 * @date 2021/3/6:14:09
 * @decs TODO
 */
@RestController
public class PaymentController {


    @Value("${server.port}")
    private String port;


    @GetMapping("/paymentZk/selectPayment")
    public String selectPayment(){

        return "spring zookeeper:"+ port+"\t"+ UUID.randomUUID().toString();
    }
}
