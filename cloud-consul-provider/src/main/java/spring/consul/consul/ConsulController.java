package spring.consul.consul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Administrator
 * @class ConsulController
 * @date 2021/3/6:15:06
 * @decs TODO
 */
@RestController
public class ConsulController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/paymentConsul/selectPayment")
    public String selectPayment(){

        return "spring Consul:"+ port+"\t"+ UUID.randomUUID().toString();
    }
}
