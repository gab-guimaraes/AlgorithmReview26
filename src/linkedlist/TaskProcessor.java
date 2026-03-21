package linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class TaskProcessor {
    public static void main(String[] args) {
        Deque<String> tasksQueue = new LinkedList<>();
        tasksQueue.addLast("send e-mail");
        tasksQueue.addLast("generate report");
        tasksQueue.addLast("save database...");
        tasksQueue.addLast("clean logs");
        System.out.println("Initial queue" + tasksQueue);
        while (!tasksQueue.isEmpty()) {
            String currentTask = tasksQueue.removeLast();
            System.out.println("Processing" + currentTask);
        }

        System.out.println("All tasks completed");

    }
}
