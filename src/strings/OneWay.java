package strings;

public class OneWay {
    public static boolean oneWayString(String s, String t) {
        if (s == null || t == null) return false;
        if (Math.abs(s.length() - t.length()) > 1) return false;
        if (s.length() == t.length())
            return compareReplace(s,t);
        if (s.length() > t.length())
            return compareInsert(s, t);
        else
            return compareInsert(t, s);
    }

    public static boolean compareReplace(String s, String t) {
        int divergences = 0;
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) != t.charAt(i)) {
                divergences++;
                if (divergences > 1) return false;
            }
        }
        return true;
    }

    //s sempre maior
    public static boolean compareInsert(String s, String t) {
        int divergences = 0;
        int sPointer = 0;
        int tPointer = 0;
        //p a l e - s
        //p l e   - t
        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
                tPointer++;
            } else {
                sPointer++;
                divergences++;

                if (divergences > 1) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(oneWayString("pale", "ple"));
        System.out.println(oneWayString("pales", "pale"));
        System.out.println(oneWayString("pale", "bale"));
        System.out.println(oneWayString("pale", "bake"));
    }
}
