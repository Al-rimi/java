package quizelementaryprogram;
import java.util.Scanner;

public class PatternPrinter { // Quiz 1:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i) * 2 ; j++) {
                System.out.printf(" ");
            }

            int num = 1;

            for (int j = 0; j < i; j++) {
                System.out.printf(num + " ");
                num *= 2;
            }

            num /= 2;

            for (int j = 1; j < i; j++) {
                num /= 2;
                System.out.printf(num + " ");
            }

            System.out.println();
        }
    }
}