package com.hj.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author HJ
 * @date 2020-06-29
 **/
@SpringBootApplication(scanBasePackages = "com.hj.learn")
@EnableAspectJAutoProxy
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }

}
