import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        int[] scoresList = new int[5];
        Integer[] scoresList2 = new Integer[5];

        String[] favMovies = { "Avengers", "Infinity War", "Iron Man" };

        System.out.println("First movie: " + favMovies[0]);
        favMovies[0] = "Endgame";
        System.out.println("Updated first movie: " + favMovies[0]);
        System.out.println("Movie list length: " + favMovies.length);

        System.out.println("scoresList: " + Arrays.toString(scoresList));
        System.out.println("scoresList2: " + Arrays.toString(scoresList2));

        scoresList = new int[] { 7, 3, 8, 4, 5 };

        System.out.println("Before sort: " + Arrays.toString(scoresList));
        Arrays.sort(scoresList);
        System.out.println("After sort: " + Arrays.toString(scoresList));

        Arrays.fill(scoresList, 100);
        System.out.println("After fill: " + Arrays.toString(scoresList));

        String[] heroes = { "Ironman", "Captain America", "Hawkeye", "Hulk", "Black Widow", "Thor" };
        System.out.println("Heroes: " + Arrays.toString(heroes));

        String[] heroesCopy = Arrays.copyOf(heroes, heroes.length);
        System.out.println("heroesCopy: " + Arrays.toString(heroesCopy));

        String[] heroesPartialCopy = Arrays.copyOf(heroes, 3);
        System.out.println("heroesPartialCopy: " + Arrays.toString(heroesPartialCopy));

        String[] heroesExtendedCopy = Arrays.copyOf(heroes, heroes.length + 3);
        System.out.println("heroesExtendedCopy: " + Arrays.toString(heroesExtendedCopy));

        Arrays.sort(heroes);
        System.out.println("Sorted heroes: " + Arrays.toString(heroes));

        System.out.println("Search for Hulk: " + Arrays.binarySearch(heroes, "Hulk"));
        System.out.println("Search for Ironman: " + Arrays.binarySearch(heroes, "Ironman"));

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };

        System.out.println("arr1 == arr2: " + (arr1 == arr2));
        System.out.println("Arrays.equals(arr1, arr2): " + Arrays.equals(arr1, arr2));
    }
}
