// Ex2: Display String Length, First Letter, and Last Letter

import java.util.Scanner;

public class StringInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Length: " + input.length());
        System.out.println("First Letter: " + input.charAt(0));
        System.out.println("Last Letter: " + input.charAt(input.length() - 1));

        scanner.close();
    }
}
