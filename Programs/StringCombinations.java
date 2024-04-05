package Programs;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static List<String> generateCombinations(String input, int k) {
        List<String> combinations = new ArrayList<>();
        backtrack("", input, k, combinations);
        return combinations;
    }

    private static void backtrack(String current, String remaining, int k, List<String> combinations) {
        if (current.length() == k) {
            combinations.add(current);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = current + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            backtrack(newPrefix, newRemaining, k, combinations);
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        int k = 3; // Set the desired length of combinations

        List<String> combinations = generateCombinations(input, k);
        System.out.println("Combinations of length " + k + " from '" + input + "':");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}