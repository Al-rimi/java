// Ex8: Calculate Square Root using Binary Search

import java.util.Scanner;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        double low = 0, high = n, mid = 0;

        while ((high - low) > 0.0001) {
            mid = (low + high) / 2;
            if (mid * mid > n) {
                high = mid;
            } else {
                low = mid;
            }
        }

        System.out.printf("The square root of %d is %.3f\n", n, mid);
        scanner.close();
    }
}
