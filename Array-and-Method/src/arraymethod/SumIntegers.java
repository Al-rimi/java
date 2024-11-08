package arraymethod;
import java.util.Scanner;

public class SumIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter integers (0 to end):");
        while (true) {
            int number = input.nextInt();
            if (number == 0)
                break;
            total += number;
        }

        input.close();
        System.out.println("Total: " + total);
    }
}
