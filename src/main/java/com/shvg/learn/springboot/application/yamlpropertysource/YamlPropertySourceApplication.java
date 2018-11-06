package com.shvg.learn.springboot.application.yamlpropertysource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication(
        scanBasePackages = {
                "com.shvg.learn.springboot.common",
                "com.shvg.learn.springboot.application.springprofiles"
        })
//@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:config/learn-springboot-properties-dev.yml")

public class YamlPropertySourceApplication {

    private static Logger logger = LoggerFactory.getLogger(YamlPropertySourceApplication.class);

	public static void main(String[] args) {

        ConfigurableApplicationContext context
                = new SpringApplicationBuilder(YamlPropertySourceApplication.class)
                .properties(
                        "spring.config.name=learn-springboot-properties"
                        /*,"spring.config.location=classpath:/resources/config/"*/)
                .addCommandLineProperties(true)
                .run(args);

        ConfigurableEnvironment env = context.getEnvironment();
        logger.info("my.messageValue {}",env.getProperty("my.messageValue"));

        env.getPropertySources()
                .forEach(ps -> {
                    System.out.println(ps.getName() + " : " + ps.getClass());
                    System.out.println("my.messageValue: "+ps.getProperty("my.messageValue"));
                });

    }
}
