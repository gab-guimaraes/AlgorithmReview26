package slidingwindow;

public class MaxNegativeSubArray {
    public static int maxNegative(int[] nums, int k) {
        int left = 0;
        int countNegative = 0;
        int maxNegative = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] < 0) countNegative++;
            if (right - left + 1 > k) {
                if (nums[left] < 0) countNegative--;
                left++;
            }
            if (right - left + 1 == k) {
                maxNegative = Math.max(maxNegative, countNegative);
            }
        }
        return countNegative;
    }
}
