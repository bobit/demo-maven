import java.util.Arrays;

/**
 * 求俩数之和
 *
 * @Author: bobit
 * @Date: 2018/12/5 12:21
 */
public class SolutionExample {
    public static void main(String args[]) {
        // todo
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
