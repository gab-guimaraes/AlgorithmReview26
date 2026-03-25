package designpatterns.let_code;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put('I', 1);
        integerHashMap.put('V', 5);
        integerHashMap.put('X', 10);
        integerHashMap.put('L', 50);
        integerHashMap.put('C', 100);
        integerHashMap.put('D', 500);
        integerHashMap.put('M', 1000);
        int total = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = integerHashMap.get(s.charAt(i));
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }
        return total;

    }
}
