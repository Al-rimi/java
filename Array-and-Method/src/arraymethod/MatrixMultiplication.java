package arraymethod;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the first matrix:");
        int rows1 = input.nextInt();
        int cols1 = input.nextInt();
        double[][] matrix1 = new double[rows1][cols1];

        System.out.println("Enter the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = input.nextInt();
        double[][] matrix2 = new double[cols1][cols2];

        System.out.println("Enter the second matrix:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }

        input.close();

        double[][] result = multiplyMatrices(matrix1, matrix2);
        System.out.println("Result of multiplication:");
        for (double[] row : result) {
            for (double num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        double[][] product = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                product[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return product;
    }
}