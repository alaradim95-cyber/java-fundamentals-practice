import java.util.ArrayList;
import java.util.Arrays;

public class LearnArrayLists {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Ironman");
        namesList.add("Captain America");
        namesList.add("Hawkeye");
        namesList.add("Hulk");

        System.out.println("Names list: " + namesList);
        System.out.println("First hero: " + namesList.get(0));

        namesList.set(0, "Black Widow");
        System.out.println("Updated first hero: " + namesList.get(0));

        namesList.remove(0);
        System.out.println("After remove: " + namesList);
        System.out.println("Size: " + namesList.size());

        ArrayList<String> heroes = new ArrayList<>(
            Arrays.asList("Ironman", "Captain America", "Hawkeye", "Hulk", "Black Widow", "Thor")
        );

        ArrayList<String> moreHeroes = new ArrayList<>(
            Arrays.asList("Doctor Strange", "Spiderman", "Black Panther")
        );

        heroes.addAll(moreHeroes);
        System.out.println("All heroes: " + heroes);

        ArrayList<String> villainsList = new ArrayList<>(
            Arrays.asList("Thanos", "Ultron", "Loki")
        );

        System.out.println("Is Thanos here? " + villainsList.contains("Thanos"));
        System.out.println("Is Spiderman here? " + villainsList.contains("Spiderman"));

        System.out.println("Index of Thanos: " + villainsList.indexOf("Thanos"));
        System.out.println("Index of Ultron: " + villainsList.indexOf("Ultron"));

        ArrayList<String> moreVillains = new ArrayList<>(
            Arrays.asList("Ultron", "Loki")
        );

        villainsList.removeAll(moreVillains);
        System.out.println("After removing villains: " + villainsList);
        System.out.println("villainsList.isEmpty(): " + villainsList.isEmpty());

        heroes.retainAll(Arrays.asList("Ironman", "Spiderman"));
        System.out.println("Retained heroes: " + heroes);
    }
}
