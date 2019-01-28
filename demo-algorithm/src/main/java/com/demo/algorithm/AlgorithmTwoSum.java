package com.demo.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode算法题与解答
 * 题目
 * 给定一个整数数列，找出其中和为特定值的那两个数。
 * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
 *
 * @Author: zhangb
 * @Date: 2018/12/20 21:45
 */

public class AlgorithmTwoSum {
    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();    //获取开始时间,以毫秒为单位计算的
        long startTime = System.nanoTime();    //获取开始时间,以纳秒为单位计算的
        //doSomething();    //测试的代码段

        int[] nums = {1, 2, 3, 4, 5};
        int[] oneResult;
        int[] twoResult;

        oneResult = twoSum(nums, 6);
        //twoResult = twoSum2(nums, 6);
        System.out.println(Arrays.toString(oneResult));


        long endTime = System.nanoTime();    //获取结束时间
//        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");    //输出程序运行时间
    }

    /**
     * 普遍方法是直接遍历两遍数组，第一遍用target-nums[i]，第二遍找nums数组中是否存在target-nums[i]这个数字，找到就返回两个数字组成的数组，这个方法时间复杂度比较大为O(n²)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == v && j != i) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 用哈希表先把数组中的数字和对应的下标存储一遍，即数字作为键，下标作为值，存储，当遍历数组的时候用target-nums[i]，得到差k，然后在map中找是否存在 k，找到即返回k所对应的value,也就是所对应的数组下标。这样时间复杂度就为O(n+l)，快了好多
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], i);
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            if (map.containsKey(v) && i != map.get(v)) {
                result[0] = i;
                result[1] = map.get(v);
                return result;
            }
        }
        return result;
    }

}
