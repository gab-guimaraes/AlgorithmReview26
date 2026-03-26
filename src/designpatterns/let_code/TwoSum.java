package designpatterns.let_code;

import java.util.HashMap;

/*
- Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

- You may assume that each input would have exactly one solution,
and you may not use the same element twice.

-You can return the answer in any order.

Example: num [2,7,11,15], target  = 9
Output: [0,1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];

            if (map.containsKey(rest)) {
                return new int[]{map.get(rest), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}
