package designpatterns.chain_of_responsability;

public class Payment {
    String user;
    double amount;
    boolean authenticated;
    double balance;

    public Payment(String user, double amount, boolean authenticated, double balance) {
        this.user = user;
        this.amount = amount;
        this.authenticated = authenticated;
        this.balance = balance;
    }
}
