package ua.edu.ucu.apps.flowerstore.payments;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.println("Payment with PayPal: ...");
        return true;
    }
}