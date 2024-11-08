package arraymethod;
import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        input.close();
        if (hasConsecutiveFours(arr)) {
            System.out.println("The array has consecutive fours.");
        } else {
            System.out.println("The array has no consecutive fours.");
        }
    }

    public static boolean hasConsecutiveFours(int[] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2] && arr[i] == arr[i + 3]) {
                return true;
            }
        }
        return false;
    }
}
