package com.exoscale.syslog.micronaut;

public class Foo {

    private final String label;

    public Foo(MicronautConfigProperties props) {
        label = props.getFoo();
    }

    public String foo() {
        return label;
    }
}
