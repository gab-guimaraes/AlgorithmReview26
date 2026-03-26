package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumArray {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numAndIndex = new HashMap<>();
        // [2,7,11,15], target = 9
        // [0,1]
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int rest = target - currentNum;
            if (numAndIndex.containsKey(rest)) {
                return new int[] {numAndIndex.get(rest), i};
            }
            numAndIndex.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[] {2,7,11,15}, 9);
        System.out.println(Arrays.toString(result));
    }
}
