package hashmaps.creating_hashmap;

public class MyHashMap {
    private Node[] buckets;
    private int capacity = 10;

    public MyHashMap() {
        buckets = new Node[capacity];
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, String value) {
        int hash = hash(key);
        Node node = buckets[hash];
        if (node == null) {
            buckets[hash] = new Node(key, value);
        } else {
            Node aux = node;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = new Node(key, value);
        }
    }


}
