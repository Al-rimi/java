package elementaryprogram;
import java.util.Scanner;

public class PalindromeCheck { // Ex4. Palindrome Check
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.next();

        input.close();
        
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        if (str.equals(reversedStr)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" not a palindrome.");
        }
    }
}
