package com.demo.lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 用在类上，自动生成无参构造和使用所有参数的构造函数以及把所有@NonNull属性作为参数的构造函数，如果指定staticName = “of”参数，同时还会生成一个返回类对象的静态工厂方法，比使用构造函数方便很多
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:52
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class ConstructorExample4Lombok<T> {
    private int x, y;
    @NonNull
    private T description;

    @NoArgsConstructor
    public static class NoArgsExample {
        @NonNull
        private String field;
    }
}
