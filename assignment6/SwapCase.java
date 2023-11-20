import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Swap case of characters in the string
        String swappedString = swapCase(inputString);

        // Display the result
        System.out.println("String after swapping case: " + swappedString);
    }

    // Function to swap the case of characters in a string
    private static String swapCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
            // Ignore non-alphabetic characters
        }

        return new String(charArray);
    }
}
