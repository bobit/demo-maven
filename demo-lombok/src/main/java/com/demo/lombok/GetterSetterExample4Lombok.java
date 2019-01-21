package com.demo.lombok;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * 用在属性上，自动生成setter和getter方法，默认生成的方法是public的，当然也可以通过AccessLevel指定访问范围。
 * 用在类上，相当于在所有非静态属性上添加了注解。
 * 如果想要在生成的方法上添加注解可以使用onMethod=@__({@AnnotationsHere})
 * 如果想要在生成方法的参数上添加注解可以使用onParam=@__({@AnnotationsHere})
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:14
 */
public class GetterSetterExample4Lombok {
    /**
     * Age of the person. Water is wet.
     *
     * @param age New value for this person's age. Sky is blue.
     * @return The current value of this person's age. Circles are round.
     */
    @Getter
    @Setter
    private int age = 10;

    /**
     * Name of the person.
     * -- SETTER --
     * Changes the name of this person.
     *
     * @param name The new value.
     */
    @Setter(AccessLevel.PROTECTED)
    private String name;

    @Override
    public String toString() {
        return String.format("%s (age: %d)", name, age);
    }
}
