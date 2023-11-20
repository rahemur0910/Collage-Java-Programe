import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Remove white spaces
        String stringWithoutSpaces = removeSpaces(inputString);

        // Display the result
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    // Function to remove white spaces from a string
    private static String removeSpaces(String str) {
        // Using replaceAll() to remove spaces
        return str.replaceAll("\\s", "");
    }
}
