package arraymethod;
import java.util.Scanner;

public class MaxSquareSubmatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");

        int rows = input.nextInt();
        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        input.close();

        int[] result = findLargestBlock(matrix);

        System.out.println("The maximum square submatrix is at (" + result[0] + "," +
                result[1] + ") with size " + result[2] + ".");
    }

    public static int[] findLargestBlock(int[][] m) {
        int maxSize = 0;
        int row = 0, col = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int size = 0;
                while (i + size < m.length && j + size < m[i].length && allOnes(m, i,
                        j, size)) {
                    size++;
                }

                if (size > maxSize) {
                    maxSize = size;
                    row = i;
                    col = j;
                }
            }
        }

        return new int[] { row, col, maxSize };
    }

    public static boolean allOnes(int[][] m, int i, int j, int size) {
        for (int r = i; r <= i + size; r++) {
            for (int c = j; c <= j + size; c++) {
                if (m[r][c] != 1)
                    return false;
            }
        }
        
        return true;
    }
}
