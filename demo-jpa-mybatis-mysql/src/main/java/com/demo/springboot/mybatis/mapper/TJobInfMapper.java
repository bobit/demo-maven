package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TJobInf;

public interface TJobInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobInf record);

    int insertSelective(TJobInf record);

    TJobInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TJobInf record);

    int updateByPrimaryKey(TJobInf record);
}