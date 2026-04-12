package strings;

public class OneWay {
    public static boolean oneWayString(String s, String t) {
        if (s == null || t == null) return false;
        if (Math.abs(s.length() - t.length()) > 1) return false;
        int divergences = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sChar != tChar) divergences++;
        }
        return !(divergences >= 2);
    }

    public static void main(String[] args) {
        System.out.println(oneWayString("pale", "ple"));
        System.out.println(oneWayString("pales", "pale"));
        System.out.println(oneWayString("pale", "bale"));
        System.out.println(oneWayString("pale", "bake"));
    }
}
