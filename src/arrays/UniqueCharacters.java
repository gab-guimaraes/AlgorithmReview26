package arrays;

import java.util.HashSet;

public class UniqueCharacters {
    public static boolean isUniqueCharsOne(String str) {
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println("para o char: " + str.charAt(i));
            System.out.println("o val é: "+ val + "\n");
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

    public static boolean isUniqueCharsTwo(String str) {
        HashSet<Character> hashSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (hashSet.contains(c)) return false;
            hashSet.add(c);
        }
        return true;
    }
}
