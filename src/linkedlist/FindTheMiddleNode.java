package linkedlist;

public class FindTheMiddleNode {
    public static void main(String[] args) {
        BlinkedList blinkedList = new BlinkedList(new Node("1"));
        blinkedList.addNode("2");
        blinkedList.addNode("3");
        blinkedList.addNode("4");
        blinkedList.addNode("5");
        blinkedList.addNode("6");
        blinkedList.addNode("7");
        blinkedList.printAllBlinkedList();
        System.out.println(findMiddle(blinkedList.getFirstNode()).getValue());
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        System.out.println("Finding the middle...");
        while (fast != null && fast.getNextNode() != null) {
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();
        }
        return slow;
    }
}
