package com.test.rwmybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.rwmybatis.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-plugin.xml"})
public class ATest {

    @Autowired
    private TestMapper mapper;
    
    @Test
    public void testCount(){
        
        mapper.count(1);
    }
}
