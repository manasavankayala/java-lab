
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] sum = new int[r][c];
        int[][] product = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        // Addition
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of Matrices:");
        for (int[] row : sum) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        // Multiplication (only for square matrices)
        if (r == c) {
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++) {
                    product[i][j] = 0;
                    for (int k = 0; k < c; k++)
                        product[i][j] += A[i][k] * B[k][j];
                }

            System.out.println("Product of Matrices:");
            for (int[] row : product) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication not possible (must be square).");
        }
    }
}
