package hashmaps;
import java.util.HashMap;

public class FirstUniqueCharacter {
    public static int firstUniqueCharacter(String word) {
        HashMap<Character, Integer> characterHashMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            characterHashMap.merge(word.charAt(i), 1, Integer::sum);
        }

        for (int i = 0; i < word.length(); i++) {
            if (characterHashMap.get(word.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharacter("leetcode"));
        System.out.println(firstUniqueCharacter("aabb"));
    }
}
