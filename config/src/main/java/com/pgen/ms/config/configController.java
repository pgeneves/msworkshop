package com.pgen.ms.config;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("/config") // <1>
public class configController {
    private final List<Service> services = Arrays.asList(new Service("kafka", "kafka", 9092));

    @Get("/")
    List<Service> services() {
        return new ArrayList<>(services);
    }
}
