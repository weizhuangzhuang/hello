package com.wzz.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description : test  //描述
 * @Author : zzwei  //作者
 * @Date: 2020-07-10 09:57  //时间
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "hahahaha" + "今天是8.19号";
    }
}
