public class Account {

    private String accountNumber;
    private double balance;
    private String accountType;

    Account(String accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    public static void main(String[] args) {

        Account acc1 = new Account("112233", 500, "saving");
        Account acc2 = new Account("112234", 1000, "saving");

        acc1.deposit(500);
        acc2.deposit(0, "deposit successfull");

        acc1.transfer(acc2, 100);

    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Account Number:" + accountNumber + "\nAccount Type:" + accountType);
        System.out.println("Updated balance:" + balance);

    }

    public void deposit(double amount, String remark) {
        balance += amount;
        System.out.println("Account Number:" + accountNumber + "\nAccount Type:" + accountType);
        System.out.println("Updated balance:" + balance + "\n" + remark);

    }

    public Account transfer(Account receiver, double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            receiver.balance += amount;

            System.out.println(
                    "\nTransferred " + amount + " from " + this.accountNumber + " to " + receiver.accountNumber);
            System.out.println("Sender's New Balance: " + this.balance);
            System.out.println("Receiver's New Balance: " + receiver.balance);
        } else {
            System.out.println("\nTransfer failed! Insufficient funds or invalid amount.");
        }
        return receiver;
    }

}
