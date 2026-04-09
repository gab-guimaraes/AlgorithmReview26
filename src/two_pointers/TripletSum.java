package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TripletSum {
    private static ArrayList<ArrayList<Integer>> tripletSum(int[] nums) {
        // I'm looking for a + b + c = 0
        // I can use the two pointers sum method, so b + c = -a
        // 1. Order the array
        // 2. Create a loop until i-2 to interacte and pivot the number
        // 3. Create a other loop to compaire this pivot to a and b
        ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int leftVal = nums[left];
                int rightVal = nums[right];
                int sum = leftVal + rightVal;
                if (sum == target) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(leftVal);
                    triplet.add(rightVal);
                    triplets.add(triplet);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    //sum > target
                    right--;
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        System.out.println(tripletSum(new int[]{-10,-3,-1,1,2,3,4}));
    }
}
