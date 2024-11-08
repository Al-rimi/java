package elementaryprogram;
import java.util.Scanner;

public class ClosestPair { // Test 2: find the two points that are nearest to each other. 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n < 2) {
            System.err.println("At least two points are required.");
        }

        double[][] points = new double[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = scanner.nextDouble(); // x coordinate
            points[i][1] = scanner.nextDouble(); // y coordinate
        }

        scanner.close();

        double minDistance = Double.MAX_VALUE;
        int p1 = 0, p2 = 0;

        // Finding the closest pair
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = simpleDistance(points[i], points[j]);
                if (dist < minDistance) {
                    minDistance = dist;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        // Output the closest pair
        System.out.printf("(%d,%d) (%d,%d)\n",
                          (int) points[p1][0], (int) points[p1][1],
                          (int) points[p2][0], (int) points[p2][1]);
    }

    // Method to calculate Euclidean distance between two points
    public static double simpleDistance(double[] p1, double[] p2) {
        double xDiff = p1[0] - p2[0];
        double yDiff = p1[1] - p2[1];
        return sqrtManual(xDiff * xDiff + yDiff * yDiff);
    }

    // Improved square root calculation method
    public static double sqrtManual(double number) {
        if (number == 0) return 0;
        double guess = number;
        for (int i = 0; i < 10; i++) {
            guess = (guess + number / guess) / 2;
        }
        return guess;
    }
}
