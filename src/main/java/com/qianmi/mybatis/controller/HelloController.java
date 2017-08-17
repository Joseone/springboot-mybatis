package com.qianmi.mybatis.controller;

import com.qianmi.mybatis.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 * <p>
 * <p>FileName: com.qianmi.mybatis.controller.HelloController</p>
 * <p>Date: 2017-08-17 15:06.</p>
 *
 * @author <a href="mailto:lilonglong@qianmi.com">of2639-李龙龙</a>
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/myname")
    public String getMyName(){
        helloService.getOne("A910917");

        return "lilonglong";
    }
}
