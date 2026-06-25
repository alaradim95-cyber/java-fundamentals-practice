public class LearnControlFlow {
    public static void main(String[] args) {
        int budget = 1000;
        int expense = 90;

        if (budget > expense) {
            System.out.println("You are within budget");
        } else {
            System.out.println("You are over budget");
        }

        int score = 70;

        if (score > 90) {
            System.out.println("A");
        } else if (score > 80) {
            System.out.println("B");
        } else if (score > 70) {
            System.out.println("C");
        } else if (score > 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("\nFor loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }

        System.out.println("\nWhile loop:");
        boolean isRunning = true;
        int j = 0;

        while (isRunning) {
            System.out.println("j: " + j);
            if (j == 5) {
                isRunning = false;
            }
            j++;
        }

        System.out.println("\nBreak example:");
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println("k: " + k);
        }

        System.out.println("\nContinue example:");
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                continue;
            }
            System.out.println("m: " + m);
        }
    }
}
