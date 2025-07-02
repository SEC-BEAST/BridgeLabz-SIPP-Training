import java.util.Scanner;

class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;

    final String accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount("Ayush", "ACC123");
        acc1.displayDetails();
        getTotalAccounts();
    }
}
