package com.test.rwmybatis.mapper;

import org.apache.ibatis.annotations.Param;

public interface TestMapper {
    
    public int count(@Param("a") int a);

}
