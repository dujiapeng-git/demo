package com.djp.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TestController {
    private Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/hello")
    public String hello(Model model) {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.info("TestController被访问了，时间：{}",s.format(new Date()));
        String name = "dujiapeng";
        model.addAttribute("name", name);
        return "hello";
    }
}
