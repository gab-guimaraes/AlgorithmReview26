package linkedlist;

public class Main {
    public static void main(String[] args) {
        Node firstNode = new Node("John Wick");
        BlinkedList blinkedList = new BlinkedList(firstNode);
        blinkedList.printAllBlinkedList();
    }
}
