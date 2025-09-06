import java.util.Scanner;

interface PaymentStrategy {
    void pay();

}

class CreditCardPayment implements PaymentStrategy {
    private double amount;

    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Credit Card Payment Successful: " + amount);
    }
}

class PaypalPayment implements PaymentStrategy {
    private double amount;

    public PaypalPayment(double amount) {
        this.amount = amount;
    }

    public void pay() {
        System.out.println("PayPal Payment Successful: " + amount);
    }
}

class BitcoinPayment implements PaymentStrategy {
    private double coins;

    public BitcoinPayment(double coins) {
        this.coins = coins;
    }

    public void pay() {
        System.out.println("Bitcoin Payment Successful: " + coins + " BTC");

    }
}

public class PaymentMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;
        int choice;
        char input;
        do {
            System.out.println("Select Payment method to proceed payment:");
            System.out.println("Enter 1 : Card Payment");
            System.out.println("Enter 2 : Pay pal");
            System.out.println("Enter 3 : Bitcoins");
            System.out.println("Enter 0 : to exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter amount:");
                    amount = sc.nextDouble();
                    new CreditCardPayment(amount).pay();
                    break;
                case 2:
                    System.out.print("enter amount:");
                    amount = sc.nextDouble();
                    new PaypalPayment(amount).pay();
                    break;
                case 3:
                    System.out.print("enter bitcoins:");
                    double coins = sc.nextDouble();
                    new BitcoinPayment(coins).pay();
                    break;
                case 0:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
            System.out.println("Do you want to proceed more payment " + "\n"+ "Enter 'Y' for yes and 'N' for no");
            input = sc.next().charAt(0);
        } while (input == 'Y');

    }
}
