package slidingwindow;

import java.util.HashMap;
import java.util.HashSet;

/* Dada uma string s, encontre o máximo número de vogais em qualquer substring de tamanho k. */
public class MaxVogals {
    public int maxSubVogals(String s, int k) {
        HashSet<Character> vogals = new HashSet<>();
        vogals.add('a');
        vogals.add('e');
        vogals.add('i');
        vogals.add('o');
        vogals.add('u');

        int count = 0;
        int max = 0;
        int left = 0;

        //abce
        for (int right = 0; right < s.length(); right++) {
            // 1. add
            char r = s.charAt(right);
            if (vogals.contains(r)) {
                count++;
            }

            // 2. se passou remove
            if (right - left + 1 > k) {
                char l = s.charAt(left);
                if (vogals.contains(l)) {
                    count--;
                }
                left++;
            }

            // 3. se tem k processa
            if (right - left + 1 == k) {
                max = Math.max(max, count);
            }

        }
        return max;
    }
}
