// Ex5: Display Random Uppercase Letters

import java.util.Scanner;

public class RandomLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            char randomLetter = (char) ('A' + (int) (Math.random() * 26));
            System.out.print(randomLetter + " ");
        }

        scanner.close();
    }
}
