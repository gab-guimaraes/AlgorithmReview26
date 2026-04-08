package two_pointers;

import java.util.Arrays;

public class PairSum {
    /*
    Time complexity: O(n)
    Space complexity: O(1)

    */
    private static int[] getPairSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right --;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getPairSum(new int[]{-5, -2, 3, 4, 6}, 7)));
    }
}
