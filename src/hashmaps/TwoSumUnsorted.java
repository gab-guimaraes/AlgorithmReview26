package hashmaps;
import java.util.Arrays;
import java.util.HashMap;

/*
    Time complexity: O(N) - pois fazemos um loop de acordo com nums, pior caso n
    Space complexity: O(N) - pois criamos um array para armazenar os nums
 */
public class TwoSumUnsorted {
    public static int[] twoSumUnsorted(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>(); //number, index
        for (int i = 0; i < nums.length; i++) {
            //procurar se existe o target - nums[i] no hashmap
            //se existir retornar
            //se nao adicionar
            //proxima interacao
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {i, hashMap.get(target-nums[i])};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumUnsorted(new int[]{1, 2, 3, 4, 5}, 5)));
    }
}
