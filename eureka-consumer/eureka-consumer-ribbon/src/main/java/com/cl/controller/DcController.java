package com.cl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer")
    public void dc() {
        System.out.println(1111);
        restTemplate.getForObject("http://eureka-client/dc/dc", String.class);
    }
}
