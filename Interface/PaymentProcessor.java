
interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refunded " + amount);
    }
}

class PayPalProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid using PayPal: " + amount);
    }
}
