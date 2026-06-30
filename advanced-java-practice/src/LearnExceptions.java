import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class LearnExceptions {
    private static final Logger logger = Logger.getLogger(LearnExceptions.class.getName());

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int dividePositiveNumbers(int x, int y) {
        if (x < 0 || y < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        return x / y;
    }

    public static void readFileFirstLine(String filename) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(filename);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        } else {
            System.out.println("File is empty.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        if (y == 0) {
            System.out.println("LBYL: Cannot divide by zero.");
        } else {
            System.out.println(divide(x, y));
        }

        try {
            System.out.println(divide(x, y));
        } catch (ArithmeticException exception) {
            System.out.println("EAFP: " + exception.getMessage());
        } finally {
            System.out.println("Finally block after division.");
        }

        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            logger.log(Level.WARNING, "Invalid array index used.");
            System.out.println("Array error: " + exception.getMessage());
        }

        try {
            readFileFirstLine("test.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("Checked exception: " + exception.getMessage());
        }

        try {
            System.out.println(dividePositiveNumbers(10, -2));
        } catch (NegativeNumberException exception) {
            System.out.println("Custom exception: " + exception.getMessage());
        }
    }
}