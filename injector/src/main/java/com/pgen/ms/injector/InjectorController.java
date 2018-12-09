package com.pgen.ms.injector;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.ArrayList;
import java.util.List;

@Controller("/inject") // <1>
public class InjectorController {
    private final List<Metric> metrics = new ArrayList<>();

    @Get("/")
        // <2>
    List<Metric> list() {
        return new ArrayList<>(metrics);
    }

    @Post("/")
    Metric accept(@Body Metric metric) {
        System.out.println("Accept " + metric);
        metrics.add(metric);
        return metric;
    }
}
