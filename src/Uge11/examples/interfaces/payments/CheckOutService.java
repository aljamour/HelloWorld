package Uge11.examples.interfaces.payments;

public class CheckOutService {

    public void process (String orderId, double amount, PaymentMethod method) {
        if (method.checkBalance(amount)) {
            method.pay(amount);
        } else {
            throw new RuntimeException("Not enough funds");
        }
    }

}
