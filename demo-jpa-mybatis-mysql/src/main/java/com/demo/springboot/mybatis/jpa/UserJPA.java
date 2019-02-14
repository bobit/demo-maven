package com.demo.springboot.mybatis.jpa;

import com.demo.springboot.mybatis.model.TUserInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/2/14 1:25
 */
public interface UserJPA extends
        Serializable,
        JpaRepository<TUserInf, Integer>,
        JpaSpecificationExecutor<TUserInf> {

}
