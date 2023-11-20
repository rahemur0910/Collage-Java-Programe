public class PrimeChecker {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfPrimeDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    public boolean check(int... numbers) {
        int sumOfPrimeNumbers = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                sumOfPrimeNumbers += num;
            }
        }
        return isPrime(sumOfPrimeNumbers);
    }

    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();

        // Check if a number is prime
        System.out.println(primeChecker.isPrime(7));  // true
        System.out.println(primeChecker.isPrime(4));  // false

        // Calculate the sum of prime digits
        System.out.println(primeChecker.sumOfPrimeDigits(12345));  // 5 (2 + 3)

        // Check if the sum of prime numbers is also prime
        System.out.println(primeChecker.check(2, 3, 5, 7, 11, 4, 6, 8, 9, 13));  // true (2 + 3 + 5 + 7 + 11 + 13 = 41, which is prime)
    }
}
