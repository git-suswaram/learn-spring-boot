package com.shvg.learn.springboot.application.springprofiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.system.SystemProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(
        scanBasePackages = {
                "com.shvg.learn.springboot.common",
                "com.shvg.learn.springboot.application.springprofiles"
        })

@RestController
public class SpringProfilesApplication {

    private static Logger logger = LoggerFactory.getLogger(SpringProfilesApplication.class);

	public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(SpringProfilesApplication.class)
                .properties(
                        "spring.config.name=learn-springboot-properties"
                        /*,"spring.config.location=classpath:/resources/config/"*/)
                .addCommandLineProperties(true)
                .run(args);

        ConfigurableEnvironment environment = context.getEnvironment();
        logger.info("my.messageValue {}",environment.getProperty("my.messageValue"));
    }
}
