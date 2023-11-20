import java.util.Scanner;

public class SmallestPrimeInArray {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Input 10 numbers into the array
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int smallestPrime = Integer.MAX_VALUE;

        // Find the smallest prime number in the array
        for (int num : numbers) {
            if (isPrime(num) && num < smallestPrime) {
                smallestPrime = num;
            }
        }

        if (smallestPrime != Integer.MAX_VALUE) {
            System.out.println("The smallest prime number in the array is: " + smallestPrime);
        } else {
            System.out.println("No prime number found in the array.");
        }

        scanner.close();
    }
}
