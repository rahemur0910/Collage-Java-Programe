public class Number {
    private int a;

    // Parameterized constructor
    public Number(int a) {
        this.a = a;
    }

    // Default constructor
    public Number() {
        this.a = 0;
    }

    // Display 'a' only
    public void displayA() {
        System.out.println("a: " + a);
    }

    // Create a new object with the sum of 'a' from the current object and a passed object
    public Number sumA(Number other) {
        Number result = new Number(this.a + other.a);
        return result;
    }

    public static void main(String[] args) {
        // Create three Number objects
        Number num1 = new Number(5);
        Number num2 = new Number(10);
        Number num3 = new Number();

        // Display the values of 'a' for each object
        System.out.println("Object 1:");
        num1.displayA();
        System.out.println("Object 2:");
        num2.displayA();
        System.out.println("Object 3 (default constructor):");
        num3.displayA();

        // Create a new object with the sum of 'a' from num1 and num2
        Number sumResult = num1.sumA(num2);
        System.out.println("Sum of Object 1 and Object 2:");
        sumResult.displayA();
    }
}
