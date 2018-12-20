package com.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2018/12/20 22:02
 */
public class SortUtilTests {

    @Test
    public void sortUtilTest() {
        int[] a = {3, 1, 2};
        SortUtil sortUtil = new SortUtil();
        sortUtil.sort(a, 2);
        System.out.println(Arrays.toString(a));
    }
}
