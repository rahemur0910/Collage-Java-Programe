import java.util.Scanner;

public class PositionOfLargestAndSmallest {
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

        // Find the positions of the largest and smallest numbers
        int positionOfLargest = findPositionOfLargest(numbers);
        int positionOfSmallest = findPositionOfSmallest(numbers);

        // Display the results
        System.out.println("Position of the largest number: " + (positionOfLargest + 1));
        System.out.println("Position of the smallest number: " + (positionOfSmallest + 1));
    }

    // Function to find the position of the largest number in an array
    private static int findPositionOfLargest(int[] array) {
        int max = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                position = i;
            }
        }
        return position;
    }

    // Function to find the position of the smallest number in an array
    private static int findPositionOfSmallest(int[] array) {
        int min = array[0];
        int position = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            }
        }
        return position;
    }
}
