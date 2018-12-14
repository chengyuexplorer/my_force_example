package com.yc.example.controller;

import com.yc.example.entity.Example;
import com.yc.example.service.ExampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example")
@Slf4j
public class ExampleController {
    @Autowired
    ExampleService exampleService;

    @GetMapping
    public String example(){
        Example example = exampleService.queryEntityById(1);
        log.info(example.toString());
        return "example";
    }
}
