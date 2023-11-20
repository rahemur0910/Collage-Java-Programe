import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the reverse of the string
        String reversedString = reverseString(inputString);

        // Display the result
        System.out.println("Reverse of the string: " + reversedString);
    }

    // Function to find the reverse of a string
    private static String reverseString(String str) {
        // Using StringBuilder to efficiently reverse the string
        StringBuilder reversedBuilder = new StringBuilder(str);
        return reversedBuilder.reverse().toString();
    }
}
