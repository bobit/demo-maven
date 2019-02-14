package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TDeptInf;

public interface TDeptInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDeptInf record);

    int insertSelective(TDeptInf record);

    TDeptInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDeptInf record);

    int updateByPrimaryKey(TDeptInf record);
}