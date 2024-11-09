// Ex7: Find the Smallest Index of a Given Key

import java.util.Scanner;

public class SmallestIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        scanner.close();

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("The smallest index of the key " + key + " is " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}
