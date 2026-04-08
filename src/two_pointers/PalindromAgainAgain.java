package two_pointers;

public class PalindromAgainAgain {
    private static boolean isPalindrom(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (!isAlphaNumHelper(word.charAt(left))) {
                left++;
            } else if (!isAlphaNumHelper(word.charAt(right))) {
                right++;
            } else {
                if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                    return false;
                }
                left++;
                right++;
            }
        }
        return true;
    }

    private static boolean isAlphaNumHelper(char c) {
        return Character.isLetterOrDigit(c);
    }
}
