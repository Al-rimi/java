package arraymethod;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        input.close();

        int[] reversed = reverse(numbers);
        System.out.println("Reversed numbers:");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }
}
