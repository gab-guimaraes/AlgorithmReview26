package designpatterns.chain_of_responsability;

public class AuthenticationHandler extends PaymentHandler {
    protected void process(Payment payment) {
        if (!payment.authenticated) {
            throw new RuntimeException("User not auth");
        }
        System.out.println("Auth passed...");
    }
}
