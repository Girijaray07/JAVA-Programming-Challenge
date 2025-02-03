public class BankAccount {
    String bhName;
    int accNumber;
    float balance;
    String accType;

    public BankAccount(String bhName, int accNumber, float balance, String accType) {
        this.bhName = bhName;
        this.accNumber = accNumber;
        this.balance = balance;
        this.accType = accType;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "rs deposited.");
        } else {
            System.out.println("Deposit amount rejected.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "rs withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount rejected.");
        }
    }

    public void transfer(float amount) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            System.out.println("\nTransferred " + amount);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    public void displayAccount() {
        System.out.println("\nAccount Holder Name: " + bhName);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accType);
    }

    public static void main(String args[]) {
        BankAccount account1 = new BankAccount("Girija Ray", 20245, 500000, "Savings");

        account1.displayAccount();

        System.out.println("\nDepositing 10000 into Account 1...");
        account1.deposit(10000);

        System.out.println("\nWithdrawing 10000 into Account 1...");
        account1.withdraw(100);

        System.out.println("\nTransferring 5000 to Account 3...");
        account1.transfer(5000);

        account1.displayAccount();
    }
}
