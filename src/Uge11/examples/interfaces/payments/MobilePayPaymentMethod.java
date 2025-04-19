package Uge11.examples.interfaces.payments;

public class MobilePayPaymentMethod implements PaymentMethod{

    @Override
    public boolean checkBalance(double amount) {
        return false;
    }

    @Override
    public void pay(double amount) {

    }
}
