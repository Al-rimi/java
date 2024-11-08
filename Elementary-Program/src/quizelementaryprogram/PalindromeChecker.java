package quizelementaryprogram;
import java.util.Scanner;

public class PalindromeChecker { // Quiz 5:
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 2;
        while (n-- > 0) {
            int x = scan.nextInt();

            if (isPalindrome(x)) {
                System.err.println("the number " + x + " is palindrome." );
            }else{
                System.err.println("the numbers " + x + " and " + revease(x) + " are not palindromes." );
            }
        }

        scan.close();

    }

    public static int revease(int n){

        int t = 0;
        while (n > 0) {
            t = t * 10 + n % 10;
            n /= 10;
        }

        return t;
    }

    public static boolean isPalindrome(int n){
        return n == revease(n);
    }
}