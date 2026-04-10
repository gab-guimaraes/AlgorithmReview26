package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);
        return Arrays.equals(aChar, bChar);
    }


 /*
        Time Complexity: O(N)
        Space Complexity: O(N) = O hash cresce de acordo com as letras!?
     */

    public static boolean isAnagramWithHash(String word, String secondWord) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char l : word.toCharArray()) {
            hashMap.put(l, hashMap.getOrDefault(l, 0) + 1);
        }
        for (char l : secondWord.toCharArray()) {
            if (!hashMap.containsKey(l)) return false;
            int count = hashMap.get(l);
            if (count == 1) {
                hashMap.remove(l);
            } else {
                hashMap.put(l, count - 1);
            }
        }
        return hashMap.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("banana", "ananab"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagramWithHash("banana", "ananab"));
        System.out.println(isAnagramWithHash("rat", "car"));
    }
}