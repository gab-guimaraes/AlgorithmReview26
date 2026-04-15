package strings;


/*
    String Compression: Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
public class StringCompression {

    public static String compression(String str) {
        if (str == null) return null;
        if (str.length() == 1) return str;
        int count = 1;
        char currentLetter = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (currentLetter == str.charAt(i)) {
                count++;
            } else {
                sb.append(currentLetter);
                sb.append(count);
                currentLetter = str.charAt(i);
                count = 1;
            }
        }

        sb.append(currentLetter);
        sb.append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compression("aaaabbc"));


    }
}
