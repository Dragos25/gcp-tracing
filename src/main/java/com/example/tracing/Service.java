package com.example.tracing;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//create a simple service
@Data
@Slf4j
@org.springframework.stereotype.Service
public class Service{
    private final Repository repository;

    public List<String> service1(){
        log.info("Service1");
        return repository.getNames();
    }

    public List<String> service2(){
        log.info("Service2");
        return repository.getNames2();
    }

    public List<String> service3(){
        log.info("Service3");
        return repository.getNames3();
    }

}