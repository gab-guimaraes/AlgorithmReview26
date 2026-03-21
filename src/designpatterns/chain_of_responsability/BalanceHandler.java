package designpatterns.chain_of_responsability;

public class BalanceHandler extends PaymentHandler {
    protected void process(Payment payment) {
        if (payment.balance < payment.amount) {
            throw new RuntimeException("Insufficient balance");
        }
        System.out.println("Balance check passed");
    }
}
