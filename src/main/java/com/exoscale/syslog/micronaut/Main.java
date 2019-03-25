package com.exoscale.syslog.micronaut;

import io.micronaut.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext
                .build()
                .deduceEnvironment(false)
                .start();
        Bar bar = context.getBean(Bar.class);
        LOGGER.info(bar.bar());
    }
}
