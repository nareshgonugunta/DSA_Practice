package ng.learn.dsa.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("processig credit card payment of amount " + amount );
    }
}
