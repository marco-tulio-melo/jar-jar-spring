package com.jarjarspring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportController {
    @Value("${app.url}")
    private String endpointUrl;
    
    @GetMapping("/upload")
    @ResponseBody
    public String upload () {
        return "bom";
    }
}
