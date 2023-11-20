import java.util.Scanner;

public class LargestNumberFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array to store 10 numbers
        int[] numbers = new int[10];

        // Input 10 numbers into the array
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the frequency of the largest number
        int largestNumber = findLargestNumber(numbers);
        int frequency = calculateFrequency(numbers, largestNumber);

        // Display the result
        System.out.println("Frequency of the largest number (" + largestNumber + "): " + frequency);
    }

    // Function to find the largest number in an array
    private static int findLargestNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Function to calculate the frequency of a specific number in an array
    private static int calculateFrequency(int[] array, int target) {
        int frequency = 0;
        for (int number : array) {
            if (number == target) {
                frequency++;
            }
        }
        return frequency;
    }
}
