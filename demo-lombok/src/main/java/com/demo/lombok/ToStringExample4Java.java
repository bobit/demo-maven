package com.demo.lombok;

import java.util.Arrays;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:43
 */
public class ToStringExample4Java {
    private static final int STATIC_VAR = 10;
    private String name;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public String getName() {
        return this.getName();
    }

    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Square(super=" + super.toString() + ", width=" + this.width + ", height=" + this.height + ")";
        }
    }

    @Override
    public String toString() {
        return "ToStringExample(" + this.getName() + ", " + this.shape + ", " + Arrays.deepToString(this.tags) + ")";
    }
}
