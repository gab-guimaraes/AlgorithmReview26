package strings;

import java.util.HashMap;

public class RomanToInteger {
    HashMap<Character, Integer> hashMap = new HashMap<>();

    public RomanToInteger() {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);}

    public static void main(String[] args) {

    }

//    public int convertRomanToInt(String roman) {
//        return -1;
//    }
}
