package hashmaps;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        boolean anagram = Anagram("abc", "cba");
        System.out.println(anagram);

    }

    public static boolean Anagram(String a, String b) {

        HashMap<Character, Integer> map = new HashMap<>();
        if (a.length() != b.length()) return false;
        for (char c : a.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        for (char c : b.toCharArray()) {
            if (!map.containsKey(c)) return false;
            int counter = map.get(c) - 1;
            if (counter == 0) {
                map.remove(c);
            } else {
                map.put(c, counter);
            }
        }
        return map.isEmpty();
    }
}
