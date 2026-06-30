public class SavingsAccount extends BankAccount {
    private double minimumBalance;

    public SavingsAccount(String accountHolder, double balance, double minimumBalance) {
        super(accountHolder, balance);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() - amount >= minimumBalance) {
            setBalance(getBalance() - amount);
            System.out.println("Savings withdrawal: " + amount);
        } else {
            System.out.println("Withdrawal denied. Minimum balance must be maintained.");
        }
    }

    @Override
    public void display() {
        System.out.println("Savings Account");
        super.display();
        System.out.println("Minimum Balance: " + minimumBalance);
    }
}