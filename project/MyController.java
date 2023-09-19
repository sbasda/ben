package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyController {
    @Autowired
    MyService service;

    @GetMapping
    public Integer add(@RequestParam(value = "params") List<Integer> params) {
        return  params.stream().mapToInt(Integer::intValue).sum();
    }



}
