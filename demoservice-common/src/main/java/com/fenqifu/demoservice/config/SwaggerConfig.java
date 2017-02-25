package com.fenqifu.demoservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**   
 * @Title: SwaggerConfig.java 
 * @Description: TODO
 * @author: yqx 
 * @date: 2017年2月24日 下午10:57:23 
 * @company: 北京鼎力创世科技有限公司
 * Copyright (c) 2011-2017 All Rights Reserved.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private boolean environmentSpecificBooleanFlag = true;

    /**
     * swagger开着
     *
     * @return
     */
    @Bean
    public Docket usercertDocketFactory() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(new ApiInfo("demo外部调用服务", "demo外部调用服务", "1.0", "demo外部调用服务", "yangqingxiang@u51.com", "", ""))
            //            .groupName("orderservice").select().paths(showControllers()).build().useDefaultResponseMessages(false)
            .groupName("orderservice").select()
            .apis(RequestHandlerSelectors.basePackage("com.fenqifu.demoservice.controller")).paths(showControllers())
            .build().useDefaultResponseMessages(false).enable(environmentSpecificBooleanFlag);
    }

    /**
     * 显示哪些页面
     *
     * @return
     */
    private Predicate<String> showControllers() {
        return new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                //                return input.contains("/v1/");
                return true;//不拦截
            }
        };
    }
}
