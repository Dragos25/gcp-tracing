package com.example.tracing;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@Slf4j
public class Controller {
    private final Service service;
    //create a dummy controller with 3 get methods
    @GetMapping("/hello")
    public String hello() {
        log.info("Controller1");
        List<String> names = service.service1();
        return names.toString();

    }

    @GetMapping("/hello2")
    public String hello2() {
        log.info("Controller2");
        List<String> names = service.service2();
        return names.toString();

    }

    @GetMapping("/hello3")
    public String hello3() {
        log.info("Controller3");
        List<String> names = service.service3();
        return names.toString();
    }

}
