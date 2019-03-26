package com.exoscale.syslog.micronaut;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class AppConfig {

    @Bean
    public Foo foo(MicronautConfigProperties props) {
        return new Foo(props);
    }

    @Bean
    public Bar bar(MicronautConfigProperties props, Foo foo) {
        return new Bar(foo, props);
    }

    @Bean
    public JsonSerializer<Bar> serializer() {
        return new JsonSerializer<Bar>() {
            @Override
            public void serialize(Bar bar, JsonGenerator generator, SerializerProvider provider) throws IOException {
                generator.writeStartObject();
                generator.writeFieldName("bar");
                generator.writeString(bar.bar());
                generator.writeEndObject();
            }
        };
    }
}
