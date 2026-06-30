public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Current account withdrawal: " + amount);
        } else {
            System.out.println("Withdrawal denied. Insufficient balance.");
        }
    }

    @Override
    public void display() {
        System.out.println("Current Account");
        super.display();
    }
}