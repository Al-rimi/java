package elementaryprogram;
import java.util.Scanner;

public class HexToDecimal { // Ex5. Hex to Decimal Conversion
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a hex number: ");
        String hex = input.next();

        input.close();
        
        int decimalValue = Integer.parseInt(hex, 16);
        
        System.out.println("The decimal value of " + hex + " is " + decimalValue);
    }
}
