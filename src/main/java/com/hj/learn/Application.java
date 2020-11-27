package com.hj.learn;

import com.hj.learn.property.ComponentProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author HJ
 * @date 2020-06-29
 **/
@SpringBootApplication(scanBasePackages = "com.hj.learn")
@EnableConfigurationProperties(ComponentProperty.class)
@EnableAspectJAutoProxy
public class Application {

    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }

}
