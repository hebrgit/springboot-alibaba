package springalibaba.hebr.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @class NacosController
 * @date 2021/3/8:22:10
 * @decs TODO
 */
@RestController
public class NacosController {

    @Value("${server.port}")
    private String port;


    @GetMapping("/nacosTest")
    public String nacosTest(){

        return "nacos 测试 "+"端口号："+port;
    }
}
