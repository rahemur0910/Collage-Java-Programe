import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Count the total number of characters
        int characterCount = countCharacters(inputString);

        // Display the result
        System.out.println("Total number of characters: " + characterCount);
    }

    // Function to count the total number of characters in a string
    private static int countCharacters(String str) {
        // Using the length() method of the String class
        return str.length();
    }
}
