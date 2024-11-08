package arraymethod;
import java.util.Scanner;

public class ArrayPartition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }

        input.close();
        int pivotIndex = partition(list);

        System.out.println("After partition:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println("\nPivot index: " + pivotIndex);
    }

    public static int partition(int[] list) {
        int pivot = list[0];
        int low = 1, high = list.length - 1;

        while (low <= high) {
            while (low <= high && list[low] <= pivot)
                low++;
            
            while (low <= high && list[high] > pivot)
                high--;
            
            if (low < high) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        list[0] = list[high];
        list[high] = pivot;
        
        return high;
    }
}