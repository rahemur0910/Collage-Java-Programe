public class HappyNumberChecker {
    public static int sumOfSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = sumOfSquareDigits(slow);
            fast = sumOfSquareDigits(sumOfSquareDigits(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static void main(String[] args) {
        int num = 7; // Input your number here
        if (isHappyNumber(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}
