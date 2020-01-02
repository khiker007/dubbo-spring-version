package com.fashares.chain.controller;

import com.fshares.chain.service.ITest1;
import com.fshares.chain.service.ITest2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Deacription TODO
 * @Author khike
 * @Date 2020/1/2 10:53
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Reference(group = "${dubbo.consumer.group}", version = "${dubbo.consumer.version}")
    private ITest1 test1;

    @Reference(group = "${dubbo.consumer.group}", version = "${dubbo.consumer.version}")
    private ITest2 test2;

    @GetMapping("/test1")
    public String test1() {
        return test1.test1("111");
    }

    @GetMapping("/test2")
    public String test2() {
        return test2.test2("111");
    }
}
