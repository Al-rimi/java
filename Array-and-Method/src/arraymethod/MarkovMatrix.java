package arraymethod;
import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        input.close();

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix.");
        } else {
            System.out.println("It is not a Markov matrix.");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            double sum = 0;

            for (int i = 0; i < m.length; i++) {
                if (m[i][j] < 0)
                    return false;
                
                sum += m[i][j];
            }

            if (sum != 1)
                return false;
        }
        return true;
    }
}