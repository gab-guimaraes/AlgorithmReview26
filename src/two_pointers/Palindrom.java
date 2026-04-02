package two_pointers;

public class Palindrom {
    //given a string, determine if it's a palindrome after removing
    //all non-alpha characters.
    public static boolean isPalindrom(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("oixio"));
    }
}
