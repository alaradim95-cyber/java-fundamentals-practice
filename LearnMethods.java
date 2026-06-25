public class LearnMethods {
    public static double calcBonus(double salary) {
        return salary * 0.1;
    }

    public static double calcBonus(double salary, double bonusRate) {
        return salary * bonusRate;
    }

    public static void main(String[] args) {
        System.out.println("Employee bonus: " + calcBonus(5000));

        System.out.printf("Staff Bonus: $%.2f\n", calcBonus(5000, 0.2));
        System.out.printf("CEO Bonus: $%.2f\n", calcBonus(20000, 1.5));
    }
}
