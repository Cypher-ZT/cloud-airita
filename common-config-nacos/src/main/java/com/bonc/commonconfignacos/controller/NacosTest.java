package com.bonc.commonconfignacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闫泽宁
 * @date 2020/6/19 21:42
 */
@RestController
@RefreshScope
public class NacosTest {
    @Value("${config.info}")
    String info;

    @GetMapping("/info")
    public String getInfo(){
        return info;
    }
}
