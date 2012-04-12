package com.test.rwmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.rwmybatis.mapper.TestMapper;

public class TestService {

    @Autowired
    private TestMapper mapper;
    
    public int count(){
        
        return mapper.count(1);
    }
}
