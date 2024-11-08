package quizelementaryprogram;
public class ArrayComparator { // Quiz 3:
    public static void main(String[] args) {
        int []arr1 = {1, 2, 3, 5};
        int []arr2 = {1, 2, 3, 4};

        if(equals(arr1, arr2)){
            System.out.println("arr1 and arr2 are equals.");
        }else{
            System.out.println("arr1 and arr2 are not equals.");
        }

    }

    public static boolean equals(int []list1, int []list2){

        if (list1 == null && list2 == null) return true;
        if (list1 == null || list2 == null) return false;
        if (list1.length != list2.length) return false;
        
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) return false;
        }

        return true;

    }
}