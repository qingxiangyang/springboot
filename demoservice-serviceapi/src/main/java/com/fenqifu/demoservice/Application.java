package com.fenqifu.demoservice;

import com.fenqifu.demoservice.Interceptor.SysoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ServletComponentScan
@EnableMongoRepositories(basePackages = "com.fenqifu.dao")
@ComponentScan(value = { "com.fenqifu.demoservice", "springfox.documentation" })
public class Application extends WebMvcConfigurerAdapter {

    @Autowired
    SysoInterceptor sysoInterceptor;
    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //不能把error也进入拦截器，否则trackNo会被重置了
        registry.addInterceptor(this.sysoInterceptor);
    }
//执行完以后关闭spring容器
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
////        TestController bean = context.getBean(TestController.class);
////        String annoTestController = bean.AnnoTestController();
////        System.out.println(annoTestController);
//        ConfigurationUserServiceTest bean = context.getBean(ConfigurationUserServiceTest.class);
//        String sayHello = bean.sayHello("config class");
//        System.out.println(sayHello);
//        context.close();
//    }


}
