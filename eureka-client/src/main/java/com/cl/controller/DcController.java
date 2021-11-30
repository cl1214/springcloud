package com.cl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/dc")
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("dc")
    public String dc() {
        List<String> allKnownRegions = discoveryClient.getServices();
        for (String item : allKnownRegions) {
            System.out.println(item);
        }
        return "";
    }

}
