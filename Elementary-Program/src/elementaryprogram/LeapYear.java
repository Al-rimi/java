package elementaryprogram;
import java.util.Scanner;

public class LeapYear { // Ex1. Check Leap Year
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        input.close();
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeap) {
            System.out.println(year + " a leap year.");
        } else {
            System.out.println(year + " not a leap year.");
        }
    }
}
