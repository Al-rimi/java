// Ex6: Sort and Display Random Integers

import java.util.Arrays;
import java.util.Scanner;

public class SortRandomIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n (10 <= n <= 10000): ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = 1 + (int) (Math.random() * 32766);
        }

        Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
