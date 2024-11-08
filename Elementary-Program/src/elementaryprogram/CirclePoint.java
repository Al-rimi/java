package elementaryprogram;
import java.util.Scanner;

public class CirclePoint { // Ex3. Check if Point is Inside the Circle
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the point (x y): ");
        int x = input.nextInt();
        int y = input.nextInt();

        input.close();
        
        double distance = Math.sqrt(x * x + y * y);
        
        if (distance <= 10) {
            System.out.println("Point(" + x + "," + y + ") is in the circle.");
        } else {
            System.out.println("Point(" + x + "," + y + ") is not in the circle.");
        }
    }
}
