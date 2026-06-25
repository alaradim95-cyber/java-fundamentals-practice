import java.util.ArrayList;
import java.util.Arrays;

public class LearnLoops {
    public static void main(String[] args) {
        int[] scoresList = {74, 32, 82, 45, 56};

        System.out.println("Looping over an array using index:");
        for (int i = 0; i < scoresList.length; i++) {
            System.out.println(scoresList[i]);
        }

        ArrayList<String> heroes = new ArrayList<>(
            Arrays.asList("Ironman", "Captain America", "Thor", "Hulk", "Black Widow", "Hawkeye")
        );

        System.out.println("\nLooping over an ArrayList using index:");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }

        System.out.println("\nEnhanced for loop over array:");
        for (int score : scoresList) {
            System.out.println(score);
        }

        System.out.println("\nEnhanced for loop over ArrayList:");
        for (String hero : heroes) {
            System.out.println(hero);
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("\nLambda forEach:");
        numbers.forEach((number) -> System.out.println(number));

        System.out.println("\nEven numbers only:");
        numbers.forEach((number) -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });

        numbers.removeIf((number) -> number % 2 != 0);
        System.out.println("\nAfter removing odd numbers: " + numbers);
    }
}
