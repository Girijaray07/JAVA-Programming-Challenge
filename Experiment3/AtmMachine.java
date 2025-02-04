import java.util.Scanner;

class AtmMachine {
    float balance;

    public AtmMachine(float Balance) {
        this.balance = Balance;
    }

    public void checkBalance() {
        System.out.println("\nYour current balance is: Rs. " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "rs deposited successfully! \n");
            checkBalance();
        } else {
            System.out.println("\nInvalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + "rs withdrawn successfully!\n");
            checkBalance();
        } else if (amount > balance) {
            System.out.println("\nInsufficient balance.");
        } else {
            System.out.println("\nInvalid withdrawal amount.");
        }
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit: Rs. ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("\nEnter amount to withdraw: Rs. ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM. Have a great day!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please select a valid option.");
            }
        } while (choice < 4);
        scanner.close();
    }

    public static void main(String[] args) {
        AtmMachine myATM = new AtmMachine(10000);
        myATM.showMenu();
    }
}
