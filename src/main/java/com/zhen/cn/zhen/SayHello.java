package com.zhen.cn.zhen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

@Controller
public class SayHello {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/sayhello")
    @ResponseBody
    public String sayHello() {
        return "hello";

    }

}