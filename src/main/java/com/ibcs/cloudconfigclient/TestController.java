package com.ibcs.cloudconfigclient;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String getMgs()
    {
        return environment.getProperty("wellcome.mgs");
    }
}
