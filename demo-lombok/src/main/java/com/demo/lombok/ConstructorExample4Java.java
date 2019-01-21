package com.demo.lombok;

import lombok.NonNull;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:54
 */
public class ConstructorExample4Java<T> {
    private int x, y;
    @NonNull
    private T description;

    private ConstructorExample4Java(T description) {
        if (description == null) throw new NullPointerException("description");
        this.description = description;
    }

    public static <T> ConstructorExample4Java<T> of(T description) {
        return new ConstructorExample4Java<T>(description);
    }

    @java.beans.ConstructorProperties({"x", "y", "description"})
    protected ConstructorExample4Java(int x, int y, T description) {
        if (description == null) throw new NullPointerException("description");
        this.x = x;
        this.y = y;
        this.description = description;
    }

    public static class NoArgsExample {
        @NonNull
        private String field;

        public NoArgsExample() {
        }
    }
}