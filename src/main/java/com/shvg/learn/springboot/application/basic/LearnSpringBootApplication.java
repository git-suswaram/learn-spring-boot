package com.shvg.learn.springboot.application.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Properties;

@SpringBootApplication(
        scanBasePackages = {
                "com.shvg.learn.springboot.common",
                "com.shvg.learn.springboot.application.basic"
        })

public class LearnSpringBootApplication {

    private static Logger logger = LoggerFactory.getLogger(LearnSpringBootApplication.class);

	public static void main(String[] args) {

	    //SpringApplication.run(LearnSpringBootApplication.class, args);

        ConfigurableApplicationContext applicationContext
                = new SpringApplicationBuilder(LearnSpringBootApplication.class)
                .properties(
                        "spring.config.name=learn-springboot-properties",
                        "spring.config.location=classpath:/resources/config/")
                .addCommandLineProperties(true)
                .run(args);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        String debugProperty = environment.getProperty("DEBUG");
        logger.info("value of debugProperty is : {}", debugProperty);

        Properties properties = System.getProperties();
        logger.info("Available System Properties are : {}", properties.toString());

    }
}
