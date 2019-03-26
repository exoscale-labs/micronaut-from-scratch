package com.exoscale.syslog.micronaut;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Foo foo(MicronautConfigProperties props) {
        return new Foo(props);
    }

    @Bean
    public Bar bar(MicronautConfigProperties props, Foo foo) {
        return new Bar(foo, props);
    }
}
