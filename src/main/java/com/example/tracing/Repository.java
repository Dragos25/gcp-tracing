package com.example.tracing;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@org.springframework.stereotype.Repository
public class Repository {
    public static List<String> getNames() {
        log.info("Repository1");
        return Arrays.asList("John", "Jane", "Jack");
    }

    public static List<String> getNames2() {
        log.info("Entered Repository2");
        for (int i = 0; i < 1000; i++);
        log.info("Exiting Repository2");
        return Arrays.asList("John2", "Jane2", "Jack2");
    }

    public static List<String> getNames3() {
        log.info("Entered Repository3");
        for (int i = 0; i < 100000; i++);
        log.info("Exiting Repository3");
        return Arrays.asList("John3", "Jane3", "Jack3");
    }
}
