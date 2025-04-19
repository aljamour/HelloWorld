package Uge11.examples.interfaces.payments;

public class Main {
    public static void main(String[] args) {
        CheckOutService checkOutService = new CheckOutService();
        PaymentMethod creditCard = new CreditCardPaymentMethod();
        PaymentMethod mobilePay = new MobilePayPaymentMethod();
        PaymentMethod cashPayment = new CashPaymentMethod();
        checkOutService.process("10", 100.25, creditCard);

    }
}
