package designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new PixPayment();
        paymentStrategy.pay(100);
        paymentStrategy = new CreditCardPayment();
        paymentStrategy.pay(1000);
    }
}
