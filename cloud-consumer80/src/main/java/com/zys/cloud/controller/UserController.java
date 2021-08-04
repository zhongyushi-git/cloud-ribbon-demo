package com.zys.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class UserController {
    private final String BASE_URL = "http://cloud-consul-provider";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public String addUser() {
        return restTemplate.getForObject(BASE_URL + "/user/get", String.class);
    }

}
