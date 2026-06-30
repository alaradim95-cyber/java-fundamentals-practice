public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Momo Alaradi", 500.0, 100.0);
        BankAccount current = new CurrentAccount("Momo Alaradi", 300.0);

        savings.deposit(100.0);
        savings.withdraw(200.0);
        savings.display();

        System.out.println();

        current.deposit(50.0);
        current.withdraw(100.0);
        current.display();
    }
}