package designpatterns.chain_of_responsability;

public class LimitHandler extends PaymentHandler {
    protected void process(Payment payment) {
        if (payment.amount > 1000) {
            throw new RuntimeException("Limit exceeded");
        }
        System.out.println("Limit check passed");
    }
}
