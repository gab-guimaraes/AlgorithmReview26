package circuitbreaker;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CircuitBreaker {
    private CircuitState state = CircuitState.CLOSED;
    private int thresholdToOpen = 10;
    private int failureCount = 0;
    private LocalDateTime stateUpdated;

    public String call(Supplier<String> supplier) {
        try {
            if (state == CircuitState.OPEN)
            {
                if (Duration.between(stateUpdated, LocalDateTime.now()).getSeconds() > 3) {
                    //we have to close
                }
                throw new RuntimeException("Circuit is Open");
            }
            return supplier.get();
        } catch (Exception e) {
            failureCount++;
            stateUpdate();
            throw e;
        }
    }

    void stateUpdate() {
        if (failureCount >= thresholdToOpen) {
            state = CircuitState.OPEN;
        }
    }
}
