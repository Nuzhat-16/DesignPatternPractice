package com.Nujhat.paymentsystem;
public class PaymentSystem {

    // Strategy interface
    interface PaymentStrategy {
        boolean pay(double amount);
    }

    // Concrete strategy for Credit Card payment
    class CreditCardPayment implements PaymentStrategy {
        public boolean pay(double amount) {
            System.out.println("making payment using Credit Card");
            return true;
        }
    }

    // Concrete strategy for PayPal payment
    class PayPalPayment implements PaymentStrategy {
        public boolean pay(double amount) {
            System.out.println("making payment using PayPal");
            // Do something
            return true;
        }
    }

    // Concrete strategy for Bank payment
    class BankPayment implements PaymentStrategy {
        public boolean pay(double amount) {
            System.out.println("making payment using Bank");
            // Do something
            return true;
        }
    }

    // Concrete strategy for Bkash payment
    class BkashPayment implements PaymentStrategy {
        public boolean pay(double amount) {
            System.out.println("making payment using Bkash");
            // Do something
            return true;
        }
    }

    // Method to make payment
    public boolean makePayment(String paymentType, double amount) {
        PaymentStrategy strategy;
        switch (paymentType) {
            case "CreditCard":
                strategy = new CreditCardPayment();
                break;
            case "PayPal":
                strategy = new PayPalPayment();
                break;
            case "Bank":
                strategy = new BankPayment();
                break;
            case "Bkash":
                strategy = new BkashPayment();
                break;
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
        return strategy.pay(amount);
    }

    // Main method to test the payment system
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.makePayment("Bank", 200);
        paymentSystem.makePayment("Bkash", 500);
        paymentSystem.makePayment("CreditCard", 5500);
    }
}
