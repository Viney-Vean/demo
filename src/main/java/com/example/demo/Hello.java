package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 5/24/2017.
 */

@Controller
public class Hello {

    @RequestMapping("/helloworld/{name}")
    @ResponseBody
    public String hello(@PathVariable String name){

        return "Hello "+name;
    }





}
