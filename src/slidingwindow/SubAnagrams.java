package slidingwindow;

import java.util.HashMap;

public class SubAnagrams {
    public static int subAnagrams(String s, String t) {
        //se t é maior do que s é impossivel ter anagrama ou sub anagrama
        if (t.length() > s.length()) return 0;
        //aqui a gente popula o target com os chars de T
        HashMap<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray()) {
            target.put(c, target.getOrDefault(c,0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0; //ponteiro left
        int count = 0; //usado para contar o numero de anagramas

        /*
        loop padrão, aqui a gente vai percorrer tudo ate s.lenght()
         */
        for (int right = 0; right < s.length(); right++) {
            //extrai rChar e coloca no hashmap Window
            //que sera usado para armazenar a nossa slide window
            char rChar = s.charAt(right);
            window.put(rChar, window.getOrDefault(rChar, 0) + 1);

            //esse if é vital para ver se passamos da quantidade de characters
            if (right - left + 1 > t.length()) {
                char lChar = s.charAt(left);
                window.put(lChar, window.get(lChar) - 1);
                if (window.get(lChar) == 0) {
                    window.remove(lChar);
                }
                left++;
            }

            if (window.equals(target)) {
                count++;
            }

        }
        return count;
    }
}
