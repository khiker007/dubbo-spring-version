package com.fshares.chain.service.impl;

import com.fshares.chain.service.ITest1;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Test1Impl
 * @Deacription TODO
 * @Author khike
 * @Date 2019/12/31 19:19
 * @Version 1.0
 **/
@Component
@Service(group = "${dubbo.provider.group}", version = "${dubbo.provider.version}")
public class Test1Impl implements ITest1 {
    @Value("${dubbo.provider.group}")
    private String group;
    @Value("${dubbo.provider.version}")
    private String version;

    @Override
    public String test1(String str) {
        return "test1--"+str + ":" + group + ":" + version;
    }
}
