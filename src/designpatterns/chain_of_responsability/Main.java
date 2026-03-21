package designpatterns.chain_of_responsability;

public class Main {
    public static void main(String[] args) {
        PaymentHandler auth = new AuthenticationHandler();
        PaymentHandler balance = new BalanceHandler();
        PaymentHandler limit = new LimitHandler();
        auth.setNext(balance).setNext(limit);
        Payment payment = new Payment("john", 200,true,5);
        auth.handle(payment);
    }
}
