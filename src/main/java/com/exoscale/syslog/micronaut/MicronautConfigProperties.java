package com.exoscale.syslog.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("app")
public class MicronautConfigProperties {

    private String foo;
    private String bar;

    public String getBar() {
        return bar;
    }

    public String getFoo() {
        return foo;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
