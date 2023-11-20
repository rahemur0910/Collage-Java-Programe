import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the character with maximum occurrences
        char maxOccurringChar = findMaxOccurringCharacter(inputString);

        // Display the result
        System.out.println("Character with maximum occurrences: " + maxOccurringChar);
    }

    // Function to find the character with maximum occurrences in a string
    private static char findMaxOccurringCharacter(String str) {
        // Using a Map to store character occurrences
        Map<Character, Integer> charOccurrences = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charOccurrences.put(ch, charOccurrences.getOrDefault(ch, 0) + 1);
        }

        // Find the character with maximum occurrences
        char maxChar = '\0'; // default value
        int maxOccurrences = 0;

        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                maxChar = entry.getKey();
                maxOccurrences = entry.getValue();
            }
        }

        return maxChar;
    }
}
