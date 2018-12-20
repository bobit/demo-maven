package com.demo.algorithm;

import org.junit.Test;

import java.util.Arrays;

/**
 * 算法测试
 *
 * @Author: zhangb
 * @Date: 2015/12/20 21:55
 */
public class SortTests {

    @Test
    public void bubbleSortTest() {
        int[] a = {3, 1, 2};
        BubbleSort sort = new BubbleSort();
        sort.sort(a);
        System.out.println(Arrays.toString(a));
    }


    @Test
    public void InsertSortTest() {

    }

    @Test
    public void BubbleSortTest() {

    }

    @Test
    public void SelectionSortTest() {

    }

    @Test
    public void ShellSortTest() {

    }

    @Test
    public void QuickSortTest() {

    }

    @Test
    public void ImprovedQuickSortTest() {

    }

    @Test
    public void MergeSortTest() {

    }

    @Test
    public void ImprovedMergeSortTest() {

    }

    @Test
    public void HeapSortTest() {

    }
}
