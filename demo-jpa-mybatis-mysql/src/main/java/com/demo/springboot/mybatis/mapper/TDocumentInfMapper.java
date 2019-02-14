package com.demo.springboot.mybatis.mapper;

import com.demo.springboot.mybatis.model.TDocumentInf;

public interface TDocumentInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TDocumentInf record);

    int insertSelective(TDocumentInf record);

    TDocumentInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TDocumentInf record);

    int updateByPrimaryKey(TDocumentInf record);
}