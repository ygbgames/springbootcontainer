package com.ygb.games.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
public class HealthController {
    private static int counter=0;
    @RequestMapping("/")
    public String index() {
        counter++;
        return "YGB Games! This is my spring boot container. Request Count : "+counter +" Time : "+new Date();
    }

}