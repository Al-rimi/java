// Ex1: Check if a String is a Substring of Another String

import java.util.Scanner;

public class SubstringCheck { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string s1: ");
        String s1 = scanner.nextLine();
        
        System.out.print("Enter the second string s2: ");
        String s2 = scanner.nextLine();

        if (s1.contains(s2)) {
            System.out.println("The string " + s2 + " is a substring of " + s1 + ".");
        } else {
            System.out.println("The string " + s2 + " is not a substring of " + s1 + ".");
        }

        scanner.close();
    }
}
