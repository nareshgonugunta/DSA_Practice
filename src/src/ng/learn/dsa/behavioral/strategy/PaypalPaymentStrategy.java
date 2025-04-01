package ng.learn.dsa.behavioral.strategy;

public class PaypalPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("processig paypal card payment of amount " + amount );
    }
}

