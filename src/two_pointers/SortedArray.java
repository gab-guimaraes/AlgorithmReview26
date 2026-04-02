package two_pointers;

public class SortedArray {
    // given an array of integers sorted in ascending order and a target value,
    // return the indexes of any pair of numbers that sum to the target

    public int[] twoPointersSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int numberLeft = nums[left];
            int numberRight = nums[right];
            int sum = numberLeft + numberRight;
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right --;
            } else {
                return new int[] {left,right};
            }
        }
        return new int[]{};
    }
}
