package com.example.demo.service;

import com.example.demo.entity.DemoInfo;
import com.example.demo.mapper.DemoInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoInfoMapper demoInfoMapper;

    public void add(DemoInfo demoInfo){
        demoInfoMapper.insert(demoInfo);
    }
}
