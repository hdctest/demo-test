package com.example.demo.controller;

import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;
    @PostMapping("/add")
    public void add(@RequestParam("user_name") String userNmae,@RequestParam("address") String address){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setUserName(userNmae);
        demoInfo.setAddress(address);
        demoService.add(demoInfo);
    }
}
