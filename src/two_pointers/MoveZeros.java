package two_pointers;

import java.util.Arrays;

public class MoveZeros {
    /*
    Time complexity: O(N)
    Space complexity: O(1)
     */
    public static int[] moveZerosFun(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int aux = nums[left];
                nums[left] = nums[right];
                nums[right] = aux;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosFun(new int[]{3, 0, 4, 10, 11})));
    }
}
