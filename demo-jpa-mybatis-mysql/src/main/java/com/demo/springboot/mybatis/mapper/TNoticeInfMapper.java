package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TNoticeInf;

public interface TNoticeInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TNoticeInf record);

    int insertSelective(TNoticeInf record);

    TNoticeInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TNoticeInf record);

    int updateByPrimaryKeyWithBLOBs(TNoticeInf record);

    int updateByPrimaryKey(TNoticeInf record);
}