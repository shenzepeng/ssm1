package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/25 21:28
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class HelloController {
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    @GetMapping("hello")
    public String hello(){
        return "hello ssm ,Today is"+new Date().getDay()+"";
    }

    @RequestMapping(value = "hello2",method = RequestMethod.GET)
    public String hello2(){
        return "hello ssm ,this is methods 2";
    }
}
