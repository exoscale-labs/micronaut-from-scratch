package com.exoscale.syslog.micronaut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Foo foo = new Foo();
        Bar bar = new Bar(foo);
        LOGGER.info(bar.bar());
    }
}
