class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void show() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: ₹" + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("1001", "Ayush", 5000);
        sa.deposit(2000);
        sa.show();
    }
}
