public class LearnOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("b % a = " + (b % a));

        System.out.println("\nUnary Operators:");
        int unaryPlus = +10;
        int unaryMinus = -10;
        System.out.println("unaryPlus: " + unaryPlus);
        System.out.println("unaryMinus: " + unaryMinus);

        int x = 10;
        int y = 10;
        System.out.println("x++: " + x++);
        System.out.println("++y: " + ++y);
        System.out.println("x after x++: " + x);
        System.out.println("y after ++y: " + y);

        System.out.println("\nAssignment Operators:");
        int compoundAdd = 8;
        compoundAdd += 10;
        System.out.println("compoundAdd: " + compoundAdd);

        int compoundSub = 10;
        compoundSub -= 5;
        System.out.println("compoundSub: " + compoundSub);

        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nLogical Operators:");
        boolean value1 = true;
        boolean value2 = false;
        System.out.println("value1 && value2: " + (value1 && value2));
        System.out.println("value1 || value2: " + (value1 || value2));
        System.out.println("!value1: " + (!value1));

        System.out.println("\nTernary Operator:");
        System.out.println(a > b ? "a is larger" : "b is larger");

        System.out.println("\nInstanceof Operator:");
        String name = "John";
        System.out.println("name is String? " + (name instanceof String));

        System.out.println("\nOperator Precedence:");
        int order1 = 10 + 5 * 2;
        int order2 = (10 + 5) * 2;
        System.out.println("10 + 5 * 2: " + order1);
        System.out.println("(10 + 5) * 2: " + order2);
    }
}