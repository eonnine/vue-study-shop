package com.vue.shop.test.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestUserService {
    
    @Autowired
    private SqlSessionTemplate sqlsession;

    public String getTestSelect(){
        return sqlsession.selectOne("test.testSelect");
    }

}
