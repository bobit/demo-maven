package com.demo.algorithm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * 算法测试
 *
 * @Author: zhangb
 * @Date: 2015/12/20 21:55
 */
public class SortTests {
    int[] intArr;

    @Before
    public void setUp() throws Exception {
        intArr = new int[]{15, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 49, 35, 25, 53, 51, 6, 14};
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(Arrays.toString(intArr));
    }

    @Test
    public void bubbleSortTest() {
        SortUtil.sort(intArr, SortUtil.BUBBLE);
    }

    @Test
    public void InsertSortTest() {
        SortUtil.sort(intArr, SortUtil.INSERT);
    }

    @Test
    public void BubbleSortTest() {
        intArr = new int[]{3, 1, 2};
        SortUtil.sort(intArr, SortUtil.BUBBLE);
    }

    @Test
    public void SelectionSortTest() {
        SortUtil.sort(intArr, SortUtil.SELECTION);
    }

    @Test
    public void ShellSortTest() {
        SortUtil.sort(intArr, SortUtil.SHELL);
    }

    @Test
    public void QuickSortTest() {
        SortUtil.sort(intArr, SortUtil.QUICK);
    }

    @Test
    public void ImprovedQuickSortTest() {
        SortUtil.sort(intArr, SortUtil.IMPROVED_QUICK);
    }

    @Test
    public void MergeSortTest() {
        SortUtil.sort(intArr, SortUtil.MERGE);
    }

    @Test
    public void ImprovedMergeSortTest() {
        SortUtil.sort(intArr, SortUtil.IMPROVED_MERGE);
    }

    @Test
    public void HeapSortTest() {
        SortUtil.sort(intArr, SortUtil.HEAP);
    }
}
