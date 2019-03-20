package com.exoscale.syslog.micronaut;

public class Bar {

    private final Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    public String bar() {
        return foo.foo() + "Bar";
    }
}
