import java.util.Scanner;

public class InterchangeMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the matrix
        int[][] matrix = inputMatrix("Enter elements for the 5x5 matrix:");

        // Interchange the largest and smallest numbers
        interchangeMinMax(matrix);

        // Display the modified matrix
        System.out.println("Modified Matrix:");
        displayMatrix(matrix);
    }

    // Function to input a 5x5 matrix
    private static int[][] inputMatrix(String message) {
        System.out.println(message);
        int[][] matrix = new int[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to interchange the largest and smallest numbers in a matrix
    private static void interchangeMinMax(int[][] matrix) {
        int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;

        // Find the position of the smallest and largest numbers
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] < matrix[minRow][minCol]) {
                    minRow = i;
                    minCol = j;
                }
                if (matrix[i][j] > matrix[maxRow][maxCol]) {
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Interchange the smallest and largest numbers
        int temp = matrix[minRow][minCol];
        matrix[minRow][minCol] = matrix[maxRow][maxCol];
        matrix[maxRow][maxCol] = temp;
    }

    // Function to display a 5x5 matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
