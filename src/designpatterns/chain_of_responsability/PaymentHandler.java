package designpatterns.chain_of_responsability;

public abstract class PaymentHandler {
    private PaymentHandler next;

    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }
    public void handle(Payment payment) {
        process(payment);
        if (next != null) {
            next.handle(payment);
        }
    }
    protected abstract void process(Payment payment);
}
