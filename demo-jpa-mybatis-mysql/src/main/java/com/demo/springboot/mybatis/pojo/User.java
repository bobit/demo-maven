package com.demo.springboot.mybatis.pojo;

import lombok.ToString;

import java.util.Date;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/2/16 15:33
 */
@ToString
public class User {

    private Integer id;

    private String loginname;

    private String password;

    private Integer status;

    private Date createdate;

    private String username;
}
