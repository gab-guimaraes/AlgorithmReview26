package arrays;

public class MaxSumArray {
    public static void main(String[] args) {


    }

    public int maxSubArray(int[] nums) {
        // 3, 1, -10, 3, 4, 2
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = 0;
            }

            currentSum = currentSum + nums[i];

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
        }

        return maxSoFar;
    }
}
