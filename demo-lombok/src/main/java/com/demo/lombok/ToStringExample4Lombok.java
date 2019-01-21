package com.demo.lombok;

import lombok.ToString;


/**
 * 用在类上，可以自动覆写toString方法，该注解默认打印类名加上所有非静态字段以名称-值的形式输出
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:17
 */
@ToString
public class ToStringExample4Lombok {
    private static final int STATIC_VAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @ToString.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @ToString(callSuper = true, includeFieldNames = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
