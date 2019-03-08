package com.demo;

import com.demo.springboot.mybatis.jpa.UserJPA;
import com.demo.springboot.mybatis.mapper.TUserInfMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.demo.springboot.mybatis.mapper")
public class DemoApplicationTests {


    @Autowired
    private TUserInfMapper userMapper;

    @Autowired
    private UserJPA userJPA;

    @Test
    public void generatorConfigTest() {
        System.out.println(userMapper.selectByPrimaryKey(1).getUsername());
//        System.out.println(userJPA.findOne(1).getUsername());
        System.out.println(userJPA.findById(1).get().getUsername());
    }


}

