package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TEmployeeInf;

public interface TEmployeeInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TEmployeeInf record);

    int insertSelective(TEmployeeInf record);

    TEmployeeInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TEmployeeInf record);

    int updateByPrimaryKey(TEmployeeInf record);
}