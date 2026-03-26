package hashmaps;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);

        return Arrays.equals(aChar, bChar);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("banana", "ananab"));
        System.out.println(isAnagram("rat", "car"));
    }
}
