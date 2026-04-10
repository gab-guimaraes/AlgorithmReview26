package hashmaps.residentevil;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Integer> inventory;
    //add
    //use
    //get all
    public Inventory() {
        inventory = new HashMap<>();
    }

    public void addItem(String item) {
        int count = inventory.getOrDefault(item, 0);
        inventory.put(item, count + 1);
    }

    public boolean useItem(String item) {
        if (!inventory.containsKey(item)) return false;
        int count = inventory.get(item);
        if (count == 1) {
            inventory.remove(item);
        } else {
            inventory.put(item, count + 1);
        }
        return true;
    }

    public String printAll() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            sb.append(entry);
        }
        return sb.toString();
    }
}