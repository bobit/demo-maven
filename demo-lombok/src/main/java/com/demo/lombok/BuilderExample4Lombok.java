package com.demo.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.Set;

/**
 * 用在类、构造器、方法上，为你提供复杂的builder API方法
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:59
 */
@Builder
public class BuilderExample4Lombok {
    @Builder.Default
    private long created = System.currentTimeMillis();
    private String name;
    private int age;
    @Singular
    private Set<String> occupations;
}
