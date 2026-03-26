package queue;

import designpatterns.strategy.PaymentStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class LikesSlidingWindow {

    Deque<LocalDateTime> likes = new ArrayDeque<>();
    private final int secondsThreshold = 3;

    public void addLikes(LocalDateTime timestamp) {
        likes.addLast(timestamp);
    }

    public int countLikes() {
        LocalDateTime now = LocalDateTime.now();
        while (!likes.isEmpty()) {
            LocalDateTime oldest = likes.peekFirst();
            Duration diff = Duration.between(oldest, now);

            if (diff.getSeconds() > secondsThreshold) {
                likes.removeFirst();
            } else {
                break;
            }
        }
        return likes.size();
    }



}
