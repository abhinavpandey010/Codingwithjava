import java.util.Scanner;

abstract class BankAccount {
    abstract void deposit(double deposit_amount);

    abstract void withdraw(double withdraw_amount);

    abstract void getBalance();

}

class SavingsAccount extends BankAccount {
    private double total_balance;
    public void deposit(double deposit_amount) {
        this.total_balance = this.total_balance + deposit_amount;
        System.out.println("deposit successful");
        System.out.println("Total balance:" + this.total_balance);
    }

    public void withdraw(double withdraw_amount) {
        if (withdraw_amount > this.total_balance) {
            System.out.println("Insufficient amount");
        } else {
            this.total_balance = this.total_balance - withdraw_amount;
            System.out.println("Successful withdrawl completed");
        }
        System.out.println("Total balance:" + this.total_balance);
    }

    public void getBalance() {

        System.out.println("Total balance:" + this.total_balance);
    }

}

class CheckingAccount extends BankAccount {
    private double total_balance;

    public void deposit(double deposit_amount) {
        this.total_balance = this.total_balance + deposit_amount;
        System.out.println("deposit successful");
        System.out.println("Total balance:" + this.total_balance);
    }

    public void withdraw(double withdraw_amount) {
        if (withdraw_amount > this.total_balance) {
            System.out.println("Insufficient amount");
        } else {
            this.total_balance = this.total_balance - withdraw_amount;
            System.out.println("Successful withdrawl completed");
        }
        System.out.println("Total balance:" + this.total_balance);
    }

    public void getBalance() {

        System.out.println("Total balance:" + this.total_balance);
    }
}

class BusinessAccount extends BankAccount {
    private double total_balance;

    public void deposit(double deposit_amount) {
        this.total_balance = this.total_balance + deposit_amount;
        System.out.println("deposit successful");
        System.out.println("Total balance:" + this.total_balance);
    }

    public void withdraw(double withdraw_amount) {
        if (withdraw_amount > this.total_balance) {
            System.out.println("Insufficient amount");
        } else {
            this.total_balance = this.total_balance - withdraw_amount;
            System.out.println("Successful withdrawl completed");
        }
        System.out.println("Total balance:" + this.total_balance);
    }

    public void getBalance() {

        System.out.println("Total balance:" + this.total_balance);
    }
}

public class TypesOfBankAccount {

    public static void main(String[] args) {
        BankAccount[] accounts = { new SavingsAccount(), new CheckingAccount(), new BusinessAccount() };

        Scanner sc = new Scanner(System.in);
        int choice;
        char input;
        do {
            System.out.println("Select Your Bank account:");
            System.out.println("Enter 1 : Saving");
            System.out.println("Enter 2 : Checking");
            System.out.println("Enter 3 : Business");
            System.out.println("Enter 0 : to exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Deposit");
                        System.out.println("Enter 2 : Withdraw");
                        System.out.println("Enter 3 : Check balance");

                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("enter amount:");
                                accounts[0].deposit(sc.nextDouble());
                                break;
                            case 2:
                                System.out.println("enter amount:");
                                accounts[0].withdraw(sc.nextDouble());
                                break;
                            case 3:
                                accounts[0].getBalance();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');

                    break;
                case 2:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Deposit");
                        System.out.println("Enter 2 : Withdraw");
                        System.out.println("Enter 3 : Check balance");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("enter amount:");
                                accounts[1].deposit(sc.nextDouble());
                                break;
                            case 2:
                                System.out.println("enter amount:");
                                accounts[1].withdraw(sc.nextDouble());
                                break;
                            case 3:
                                accounts[1].getBalance();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');

                    break;
                case 3:
                    do {
                        System.out.println("Select Below:");
                        System.out.println("Enter 1 : Deposit");
                        System.out.println("Enter 2 : Withdraw");
                        System.out.println("Enter 3 : Check balance");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.println("enter amount:");
                                accounts[2].deposit(sc.nextDouble());
                                break;
                            case 2:
                                System.out.println("enter amount:");
                                accounts[2].withdraw(sc.nextDouble());
                                break;
                            case 3:
                                accounts[2].getBalance();
                                break;
                            default:
                                break;
                        }
                        System.out.println("Do you want to continue Enter 'Y' for yes and 'N' for No");
                        input = sc.next().charAt(0);
                    } while (input == 'Y');

                    break;
                case 0:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid option selected");
                    break;
            }
        } while (choice != 0);
    }
}