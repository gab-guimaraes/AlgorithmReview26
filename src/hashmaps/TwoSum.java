package hashmaps;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(); //number, index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; //qual numero eu preciso para bater o valor?
            if (hashMap.containsKey(complement)) {
                return new int[] {hashMap.get(complement),i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1,2,3,4,5,6}, 9);
        System.out.printf(Arrays.toString(result));

    }
}
