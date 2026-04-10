package linkedlist.basic;

public class MyLinkedList {
    private final Node head;

    public MyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        Node current = head;
        while (current.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = node;
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.val);
            current = current.nextNode;
        }
    }

    public boolean detectCycles() {
        //declarar o sonic e a lesma
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public Node detectMidPoint() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.val = 0;
        MyLinkedList myLinkedList = new MyLinkedList(node);
        Node node2 = new Node();
        node2.val = 3;
        myLinkedList.add(node2);
        myLinkedList.printAll();

    }
}
