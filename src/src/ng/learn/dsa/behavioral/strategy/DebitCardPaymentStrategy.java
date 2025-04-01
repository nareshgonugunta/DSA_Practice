package ng.learn.dsa.behavioral.strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy{

    @Override
    public void processPayment(double amount) {
        System.out.println("processig debit card payment of amount " + amount );
    }
}

