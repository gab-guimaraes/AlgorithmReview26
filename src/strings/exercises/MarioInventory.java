package strings.exercises;

import java.util.HashMap;
import java.util.Map;

public class MarioInventory {
    public static void main(String[] args) {
        countWords("Mario:coin,coin,mushroom,coin,star");
    }

    public static void countWords(String list) {
        String[] getItemsList = list.split(":");
        String[] items = getItemsList[1].split(",");
        HashMap<String, Integer> hashItems = new HashMap<>();
        for (String item : items) {
            hashItems.merge(item, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry: hashItems.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    }
}
