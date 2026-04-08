package two_pointers;

public class PalindromAgain {
    /*  questions that I've been thinking:
        eu posso receber characteres não alfa numericos?
        eu posso receber espaços vazios?
        eu posso receber upper e lower case? */
    public static boolean isPalindrom(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            char charL = word.charAt(left);
            char charR = word.charAt(right);
            if (!Character.isLetterOrDigit(charL)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(charR)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(charL) != Character.toLowerCase(charR))
                return false;

            left++;
            right--;
        }
        return true;
    }
}
