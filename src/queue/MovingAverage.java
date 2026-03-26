package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

    private int size;
    private Queue<Integer> queue;
    private int sum;

    public MovingAverage(int k) {
        this.size = k;
        this.queue = new LinkedList<>();
        this.sum = 0;
    }

    public double next(int val) {
        queue.offer(val);
        if (queue.size() > size) {
            int oldVal = queue.poll();
            sum = sum - oldVal;
        }
        sum = sum + val;
        if (queue.size() > 0)
            return (double) sum / queue.size();
        return 0;
    }
}
