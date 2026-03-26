package priorityQueue;

import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(4);
        pq.offer(10);
        pq.offer(1);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
