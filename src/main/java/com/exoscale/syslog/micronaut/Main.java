package com.exoscale.syslog.micronaut;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Micronaut.run(Main.class);
    }
}
