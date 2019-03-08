package list;

import java.util.ArrayList;
import java.util.List;

/**
 * 下面程序在1处是否会有异常，如果没有，输出是什么？是否会运行到2处，如果会，输出是什么？
 *
 * @Author: zhangb
 * @Date: 2019/3/7 13:17
 */
public class ListDemo {
    public static void main(String args[]) {
        List list = new ArrayList<>();
        test2(list);
        System.out.println(list.size());//1处
        test3(list);
        System.out.println(list.size());//2处
    }

    public static void test2(List list) {
        list = null;
    }

    public static void test3(List list) {
        list.add("Loong");
    }
}
