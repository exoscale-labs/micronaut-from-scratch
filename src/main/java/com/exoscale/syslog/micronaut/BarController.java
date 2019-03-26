package com.exoscale.syslog.micronaut;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BarController.class);

    private final Bar bar;

    public BarController(Bar bar) {
        this.bar = bar;
    }

    @GetMapping("/")
    public void root() {
        LOGGER.info(bar.bar());
    }
}