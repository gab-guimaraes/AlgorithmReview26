package linkedlist;

public class BlinkedList {
    private Node firstNode;

    public BlinkedList(Node firstNode) {
        this.firstNode = firstNode;
    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void addNode(String newValue) {
        Node currentNode = firstNode;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(new Node(newValue));
    }

    public void printAllBlinkedList() {
        Node currentNode = firstNode;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
    }
}

class Node {
    private String value;
    private Node nextNode;
    public Node(String value) {
        this.value = value;
        nextNode = null;
    }
    public String getValue() {
        return value;
    }
    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
         nextNode = node;
    }

}
