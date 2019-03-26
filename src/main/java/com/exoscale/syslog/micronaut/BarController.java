package com.exoscale.syslog.micronaut;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarController {

    private final Bar bar;

    public BarController(Bar bar) {
        this.bar = bar;
    }

    @GetMapping("/")
    public Bar root() {
        return bar;
    }
}