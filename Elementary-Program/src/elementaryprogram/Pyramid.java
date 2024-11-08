package elementaryprogram;
import java.util.Scanner;

public class Pyramid { // Ex6. Pyramid Display
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of lines: ");
        int lines = input.nextInt();

        input.close();
        
        for (int i = 1; i <= lines; i++) {

            for (int j = 0; j < lines - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
