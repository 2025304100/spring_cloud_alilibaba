package com.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.demo.usercenter.dao.user")
@EnableDiscoveryClient
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @RestController
    public class EchoController {
        @Autowired
        private ConfigurableApplicationContext applicationContext;

        @GetMapping("/echo/{string}")
        public String echo(@PathVariable String string) {
            System.out.println("Demo:" + applicationContext.getEnvironment().getProperty("demo.test.ssm"));
            return applicationContext.getEnvironment().getProperty("demo.test.ssm");
        }
    }
}
