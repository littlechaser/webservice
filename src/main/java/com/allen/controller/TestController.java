package com.allen.controller;

import com.allen.webservice.server.HelloWebService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Object test() {
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        HelloWebService wsDemoClient = (HelloWebService) wac.getBean("wsDemoClient");
        Map<String, String> map = new HashMap<>();
        map.put("info", wsDemoClient.getUser("12"));
        return map;
    }
}
