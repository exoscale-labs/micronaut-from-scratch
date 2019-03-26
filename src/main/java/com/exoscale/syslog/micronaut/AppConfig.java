package com.exoscale.syslog.micronaut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Bar bar() {
        return new Bar(new Foo());
    }
}
