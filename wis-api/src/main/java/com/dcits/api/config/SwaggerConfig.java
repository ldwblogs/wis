package com.dcits.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/9/1 16:36<br/>
 *
 * @author lidw3<br />
 * @since JDK 1.8
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * swagger访问地址：http://localhost:8080/swagger-ui.html#/
     * @return
     */

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dcits.api.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("Wis项目Api信息")
                        .description("SpringBoot搭建的Wis项目对外暴露的API")
                        .version("9.0")
                        .contact(new Contact("锐行交付宝","wxjfb.dcits.com","xxx@dcits.com"))
                        .license("The Apache License")
                        .licenseUrl("wxjfb.dcits.com")
                        .build());
    }
}
