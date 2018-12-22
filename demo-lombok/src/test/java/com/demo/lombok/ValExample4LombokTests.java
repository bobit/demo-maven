package com.demo.lombok;

import lombok.val;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 用val作为局部变量的声明类型，而不使用真实的类型，编译器将从初始化表达式中推断出该类型并把变量设置为final，这个功能只适用于局部变量和foreach循环中，类的属性不适用此功能，而且初始化表达式是必须的。
 *
 * @Author: zhangb
 * @Date: 2018/17/19 23:00
 */
public class ValExample4LombokTests {
    @Test
    public void example() {
        val example = new ArrayList<String>();
        example.add("Hello, World!");
        val foo = example.get(0);
        System.out.println(foo.toLowerCase());
    }

    @Test
    public void example2() {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
