package com.yun.zhe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Value("${name}")
    String name;
	
    @RequestMapping(value = "/hi")
    public String hi(){
    	
        return name;
    }
	
}
