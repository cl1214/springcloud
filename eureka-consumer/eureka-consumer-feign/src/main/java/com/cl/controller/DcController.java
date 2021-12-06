package com.cl.controller;

import com.cl.client.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {
    @Autowired
    private DcClient dcClient;

    @GetMapping("/consumer")
    public String dc() {
        return  dcClient.cousume();
    }
}
