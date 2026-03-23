package designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with Credit Card...");
    }
}
