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

    @Value("${project.name}")
    private String name;


    @GetMapping("/nacosTest")
    public String nacosTest(){

        return name;
    }
}
