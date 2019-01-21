package com.demo.lombok;

import lombok.Getter;

/**
 * 这个注解的作用相当于缓存，就是我在第一次调用后这个值会一直存在，不在浪费资源去重复生成了，使用了getter这个annotation可以在实际使用到cached的时候生成cached，同时，Lombok会自动去管理线程安全的问题，不会存在重复赋值的问题
 *
 * @Author: zhangb
 * @Date: 2019/1/2 12:18
 */
public class GetterLazyExample4Lombok {
    @Getter(lazy = true)
    private final double[] cached = expensive();

    private double[] expensive() {
        double[] result = new double[1000000];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.asin(i);
        }
        return result;
    }
}
