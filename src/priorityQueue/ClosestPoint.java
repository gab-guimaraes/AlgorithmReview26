package priorityQueue;

import java.util.PriorityQueue;

public class ClosestPoint {

    public static int[][] closestPoint(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> distance(b) - distance(a) // max heap
        );

        for (int[] point : points) {
            pq.offer(point);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] result = new int[k][2];
        int i = 0;

        while (!pq.isEmpty()) {
            result[i++] = pq.poll();
        }

        return result;
    }

    public static int distance(int[] point) {
        return point[0]*point[0] + point[1]*point[1];
    }
}