package strings;

public class AnagramsLowLevel {

    public static boolean isAnagram(String word, String anotherWord) {
        if (word == null || anotherWord == null) return false;
        if (word.length() != anotherWord.length()) return false;

        int[] countLetters = new int[256];
        for (char c : word.toCharArray()) {
            int val = c;
            countLetters[val] = countLetters[val] + 1;
        }
        for (char c : anotherWord.toCharArray()) {
            int val = c;
            if (countLetters[val] == 0) return false;
            countLetters[val] = countLetters[val] - 1;
        }
        return true;
    }
}
