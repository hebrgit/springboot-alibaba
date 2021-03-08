package spiring.hebo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ConfigClientController
 * @Author hebo
 * @Date 2021/3/8 15:10
 **/
@RestController
public class ConfigClientController {


    @Value("${config.info}")
    private String context;

    @Value("${server.port}")
    private String port;


    @GetMapping("/configClient/configTest")
    public String configTest(){

        return "spring.application.name = "+context+"\t" + "server.port = "+port;
    }
}
