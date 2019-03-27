package com.exoscale.syslog.micronaut;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@TypeHint(Get.class)
public class Main {

    public static void main(String[] args) {
        Micronaut.run(Main.class);
    }
}
