package ng.learn.dsa.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy cresitCardPaymentStrategy = new CreditCardPaymentStrategy();
        PaymentProcessor creditPaymentProcessor = new PaymentProcessor(cresitCardPaymentStrategy);
        creditPaymentProcessor.processPayment(100);

        PaymentStrategy debitCardPaymentStrategy = new DebitCardPaymentStrategy();
        PaymentProcessor debitPaymentProcessor = new PaymentProcessor(debitCardPaymentStrategy);
        debitPaymentProcessor.processPayment(300);

        PaymentStrategy paypalCardPaymentStrategy = new PaypalPaymentStrategy();
        PaymentProcessor paypalPaymentProcessor = new PaymentProcessor(debitCardPaymentStrategy);
        paypalPaymentProcessor.processPayment(500);
    }
}
