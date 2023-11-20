//Write a program to input 10 numbers into an integer array and find the sum of prime numbers only
import java.util.Scanner;

public class SumOfPrimes {
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

        // Calculate the sum of prime numbers
        int sumOfPrimes = calculateSumOfPrimes(numbers);

        // Display the result
        System.out.println("Sum of prime numbers: " + sumOfPrimes);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to calculate the sum of prime numbers in an array
    private static int calculateSumOfPrimes(int[] array) {
        int sum = 0;
        for (int number : array) {
            if (isPrime(number)) {
                sum += number;
            }
        }
        return sum;
    }
}