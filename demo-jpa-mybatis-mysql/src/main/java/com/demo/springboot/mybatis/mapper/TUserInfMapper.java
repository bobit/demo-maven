package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TUserInf;
import org.springframework.stereotype.Component;

@Component
public interface TUserInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUserInf record);

    int insertSelective(TUserInf record);

    TUserInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUserInf record);

    int updateByPrimaryKey(TUserInf record);
}