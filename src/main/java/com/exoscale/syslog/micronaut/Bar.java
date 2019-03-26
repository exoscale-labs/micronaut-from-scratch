package com.exoscale.syslog.micronaut;

public class Bar {

    private final Foo foo;
    private final String label;

    public Bar(Foo foo, MicronautConfigProperties props) {
        this.foo = foo;
        label = props.getBar();
    }

    public String bar() {
        return foo.foo() + label;
    }
}
