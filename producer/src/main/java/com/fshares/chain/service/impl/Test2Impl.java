package com.fshares.chain.service.impl;

import com.fshares.chain.service.ITest2;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName Test2
 * @Deacription TODO
 * @Author khike
 * @Date 2019/12/31 19:20
 * @Version 1.0
 **/
@Component
@Service(group = "${dubbo.provider.group}", version = "${dubbo.provider.version}")
public class Test2Impl implements ITest2 {
    @Value("${dubbo.provider.group}")
    private String group;
    @Value("${dubbo.provider.version}")
    private String version;

    @Override
    public String test2(String str) {
        return "test2--" + str + ":" + group + ":" + version;
    }
}
