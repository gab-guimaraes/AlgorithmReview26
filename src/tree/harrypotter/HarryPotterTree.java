package tree.harrypotter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class HarryPotterTree {
    private void printBruxos(Tree node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getPerson().toString());
        printBruxos(node.getLeft());
        printBruxos(node.getRight());
    }

    public Optional<Tree> searchByName(Tree node, String name) {
        if (node == null)
            return Optional.empty();
        Deque<Tree> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Tree current = queue.pop();
            if (current.getPerson().getName().equals(name)) {
                return Optional.of(current);
            }

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        HarryPotterTree harryPotterTree = new HarryPotterTree();
        Person lilian = new Person("Lilian Potter", HogwartsHouse.GRIFNORIA, 30, true);
        Person thiago = new Person("Thiago Potter", HogwartsHouse.GRIFNORIA, 35, true);
        Person harry = new Person("Harry Potter", HogwartsHouse.GRIFNORIA, 13, false);
        Tree harryTree = new Tree(harry);
        harryTree.setRight(new Tree(thiago));
        harryTree.setLeft(new Tree(lilian));
        harryPotterTree.printBruxos(harryTree);

        Optional<Tree> searchNode = harryPotterTree.searchByName(harryTree, "Thiago Potter");
        if (searchNode.isPresent()){
            System.out.println(searchNode.get().getPerson().toString());
        } else {
            System.out.println("Não Encontrei");
        }
    }
}

class Tree {
    private Person person;
    private Tree left;
    private Tree right;

    public Tree(Person person) {
        this.person = person;
    }


    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
