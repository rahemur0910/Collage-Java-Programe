import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        int[][] matrix1 = inputMatrix("Enter elements for the first 3x3 matrix:");

        // Input for the second matrix
        int[][] matrix2 = inputMatrix("Enter elements for the second 3x3 matrix:");

        // Calculate the sum and store it in the third matrix
        int[][] sumMatrix = calculateSum(matrix1, matrix2);

        // Display the matrices and their sum
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Sum Matrix:");
        displayMatrix(sumMatrix);
    }

    // Function to input a 3x3 matrix
    private static int[][] inputMatrix(String message) {
        System.out.println(message);
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to calculate the sum of two matrices
    private static int[][] calculateSum(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    // Function to display a 3x3 matrix
    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
