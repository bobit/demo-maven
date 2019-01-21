package com.demo.lombok;

import lombok.EqualsAndHashCode;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:50
 */
@EqualsAndHashCode
public class EqualsAndHashCodeExample4Lombok {
    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude
    private Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude
    private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode(callSuper = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
