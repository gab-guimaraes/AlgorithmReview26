package tree.harrypotter;

import java.util.*;

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

    public Optional<ArrayList<Person>> searchByAlive(Tree tree) {
        System.out.println("Searching by alive persons...");
        if (tree == null)
            return Optional.empty();
        ArrayList<Person> alivePersons = new ArrayList<>();
        Deque<Tree> queue = new ArrayDeque<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            Tree treePerson = queue.pop();
            Person popPerson = treePerson.getPerson();
            if (!popPerson.isDead()) {
                alivePersons.add(popPerson);
            }
            if (treePerson.getLeft() != null) queue.add(treePerson.getLeft());
            if (treePerson.getRight() != null) queue.add(treePerson.getRight());
        }
        System.out.println("Alive people are: "+ alivePersons);
        return Optional.of(alivePersons);
    }

    //Altura da arvore
    //Contar nos por nivel
    //Caminho ate o bruxo
    //Menor idade da arvore
    //usando bfs, primeiro bruxo morto
    //converter para lista

    public static void main(String[] args) {
        HarryPotterTree harryPotterTree = new HarryPotterTree();

        // Avós
        Person avo1 = new Person("Fleamont Potter", HogwartsHouse.GRIFNORIA, 70, true);
        Person avo2 = new Person("Euphemia Potter", HogwartsHouse.GRIFNORIA, 68, true);

        // Pais
        Person lilian = new Person("Lilian Potter", HogwartsHouse.GRIFNORIA, 30, true);
        Person thiago = new Person("Thiago Potter", HogwartsHouse.GRIFNORIA, 35, true);

        // Harry
        Person harry = new Person("Harry Potter", HogwartsHouse.GRIFNORIA, 13, false);

        // Root (Harry)
        Tree harryTree = new Tree(harry);

        // Pais (nível 1)
        Tree paiNode = new Tree(thiago);
        Tree maeNode = new Tree(lilian);

        harryTree.setRight(paiNode);
        harryTree.setLeft(maeNode);

        // Avós (nível 2 - abaixo dos pais)
        paiNode.setLeft(new Tree(avo1));
        paiNode.setRight(new Tree(avo2));

        // (Opcional) avós maternos poderiam ir aqui, mas não temos nomes no seu exemplo

        // Execução
        harryPotterTree.printBruxos(harryTree);
        harryPotterTree.searchByAlive(harryTree);
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
