package rate_limiter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class RateLimiter {

    Map<UUID, Deque<LocalDateTime>> requests = new HashMap<>();

    int limiterThreshold = 4;
    int TTL = 10;

    public void handleRequest(User user) {

        if (!user.isAuthenticated()) {
            throw new RuntimeException("User must be authenticated");
        }

        if (!isRequestAllowed(user.getId())) {
            throw new RuntimeException("Rate limit exceeded");
        }

        // call service
    }

    public boolean isRequestAllowed(UUID uuid) {

        requests.putIfAbsent(uuid, new ArrayDeque<>());
        Deque<LocalDateTime> lastRequests = requests.get(uuid);

        LocalDateTime now = LocalDateTime.now();

        while (!lastRequests.isEmpty() &&
                Duration.between(lastRequests.peekFirst(), now).getSeconds() > TTL) {
            lastRequests.pollFirst();
        }

        if (lastRequests.size() < limiterThreshold) {
            lastRequests.addLast(now);
            return true;
        }

        return false;
    }
}