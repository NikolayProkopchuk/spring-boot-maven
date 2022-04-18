package com.prokopchuk.springbootmaven.contollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> returnValue = new HashMap<>();

        returnValue.put("Hello", "World");

        return returnValue;
    }
}
