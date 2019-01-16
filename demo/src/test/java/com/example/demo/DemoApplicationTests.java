package com.example.demo;

import com.example.demo.controller.DemoController;
import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private DemoService demoService;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test1(){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setUserName("test");
        demoInfo.setAddress("address");
        demoService.add(demoInfo);

    }

}

