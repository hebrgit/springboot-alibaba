package com.hebr.ordero1.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Administrator
 * @class SwaggerConfig
 * @date 2021/3/13:23:46
 * @decs TODO
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {


    @Bean
    public Docket docket(Environment environment) {
        //设置要显示swagger的环境
        Profiles profiles = Profiles.of("dev", "prov");
        boolean b = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //设置要显示swagger的环境
                .select()
//                .apis(RequestHandlerSelectors.any())//扫描全部
//                .apis(RequestHandlerSelectors.basePackage("spring.hebr.springboot.hebr.provider.controller"))//扫描包下的类
//                .apis(RequestHandlerSelectors.none())//不扫描
//                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))//扫描类上的注解
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))//扫描方法上的注解
                .paths(PathSelectors.any())
                .build()
                .enable(b);
    }


    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact("hebo", "http://localhost:8001", "18829780487"))
                .build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 解决静态资源无法访问
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        // 解决swagger无法访问
        registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        // 解决swagger的js文件无法访问
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

    }
}
