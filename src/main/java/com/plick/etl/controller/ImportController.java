package com.plick.etl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImportController {

    @GetMapping("/upload")
    @ResponseBody
    public String upload () {
        return "bom";
    } 
}