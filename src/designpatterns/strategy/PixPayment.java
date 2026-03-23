package designpatterns.strategy;

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying with PIX...");
    }
}
