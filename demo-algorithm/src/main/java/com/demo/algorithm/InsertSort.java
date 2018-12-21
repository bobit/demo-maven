package com.demo.algorithm;

/**
 * 插入排序
 *
 * @Author: zhangb
 * @Date: 2015/12/20 21:43
 */
public class InsertSort implements SortUtil.Sort {

    @Override
    public void sort(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; (j > 0) && (data[j] < data[j - 1]); j--) {
                SortUtil.swap(data, j, j - 1);
            }
        }
    }

}
