package com.demo.lombok;

/**
 * 注解能够为方法或构造函数的参数提供非空检查
 *
 * @Author: zhangb
 * @Date: 2019/1/2 10:42
 */
public class NonNullExample4JavaTests {
    public void notNullExample(String string) {
        if (string != null) {
            string.length();
        } else {
            throw new NullPointerException("null");
        }
    }
}
