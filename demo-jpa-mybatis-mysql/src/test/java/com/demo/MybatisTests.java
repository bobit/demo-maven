package com.demo;

import com.demo.springboot.mybatis.model.TUserInf;
import com.demo.springboot.mybatis.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;

/**
 * 读取配置测试
 *
 * @Author: zhangb
 * @Date: 2019/2/16 15:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisTests {

    @Test
    public void mybatisTest() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("UserMapper.selectUser", 1);
        log.info("用户数据：{}", user);
    }
}
