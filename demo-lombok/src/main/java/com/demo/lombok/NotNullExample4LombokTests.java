package com.demo.lombok;

import com.sun.istack.internal.NotNull;
import org.junit.Test;
import org.junit.runners.Parameterized;

/**
 * 注解能够为方法或构造函数的参数提供非空检查
 *
 * @Author: zhangb
 * @Date: 2019/1/2 10:58
 */
public class NotNullExample4LombokTests {

    @Test
    public void notNullExample(@NotNull String string) {
        //java.lang.Exception: Method notNullExample should have no parameters
        string.length();

    }
}
