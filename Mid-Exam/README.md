# Midterm Exam: Elementary Programming

This repository contains solutions to various programming exercises, including patterns, prime numbers, array comparison, matrix operations, palindromes, and more. Below are the explanations for each test, including example inputs and outputs.

## Test 1: Pattern Printer

Write a program that prompts the user to enter the number of rows, and print the following output.

**Example Input:**
```
Enter the number of rows: 4
```

**Example Output:**
```
      1 
    1 2 1 
  1 2 4 2 1 
1 2 4 8 4 2 1 
```

**Answer:**
```java
import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();
        scan.close();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i) * 2 ; j++) {
                System.out.printf(" ");
            }

            int num = 1;

            for (int j = 0; j < i; j++) {
                System.out.printf(num + " ");
                num *= 2;
            }

            num /= 2;

            for (int j = 1; j < i; j++) {
                num /= 2;
                System.out.printf(num + " ");
            }

            System.out.println();
        }
    }
}
```
- [Full code](src/midexam/PatternPrinter.java)


## Test 2: Twin Primes Finder

Twin primes are a pair of prime numbers that differ by 2. for example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes. Write a program to find all twin primes less than 1,000. Display the output as follows:

**Example Output:**
```
(3,5)
(5,7)
(11,13)
```

**Answer:**
```java
public class TwinPrimesFinder {
    public static void main(String[] args) {

        for(int i = 2; i < 1000; i++){
            if (isPrime(i)&&isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }

    public static boolean isPrime(int n){

        if(n <= 2)return false;

        for(int i = 2; i < n/i; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```
- [Full code](src/midexam/TwinPrimesFinder.java)


## Test 3: Array Comparison

The arrays list1 and list2 are strictly identical if their corresponding elements are equal. Write a method that returns true if list1 and list2 are strictly identical, using the following header: `public static boolean equals(int []list1, int []list2)`.

**Example Input:**
```
arr1 = {1, 2, 3, 5}
arr2 = {1, 2, 3, 4}
```

**Example Output:**
```
arr1 and arr2 are not equals.
```

**Answer:**
```java
public static boolean equals(int []list1, int []list2){

    if (list1 == null && list2 == null) return true;
    if (list1 == null || list2 == null) return false;
    if (list1.length != list2.length) return false;
    
    for (int i = 0; i < list1.length; i++) {
        if (list1[i] != list2[i]) return false;
    }

    return true;
}
```
- [Full code](src/midexam/ArrayComparator.java)


## Test 4: Matrix Column Sum

Write a method that returns the sum of all elements in a specified column in a matrixusing the following header: `public static double sumColumn(double[][] matrix, int columnIndex)`

**Example Input:**
```
Matrix: 
{{1, 2, 3}, 
 {4, 5, 6}, 
 {7, 8, 9}}
Column Index: 0
```

**Example Output:**
```
12.0
```

**Answer:**
```java
public static double sumColumn(double [][]matrix, int columnIndex){

    if (matrix == null) return 0.0;
    double sum = 0.0;

    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][columnIndex];
    }

    return sum;
}
```
- [Full code](src/midexam/MatrixColumnSum.java)


## Test 5: Palindrome Checker

A number is a palindrome if it reads the same forward and backward. For example, `1`, `121` and `123321` are all palindrome Write a program that checks whether a number is a palindrome.

**Example Input:**
```
121
```

**Example Output:**
```
The number 121 is palindrome.
```

**Answer:**
```java
import java.util.Scanner;

public class PalindromeChecker {
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
```
- [Full code](src/midexam/PalindromeChecker.java)


## Test 6: Unique Equation Solver

In the following equation, different letters represent different numbers (0, 1, 2,.., 9), and the same letter represents the same number, Please write a program to find and show alsolutions.

**Example Output:**
```
Solution: AB=12, CD=34, EF=56, GH=78, PPP=134
```

**Answer:**
```java
public class UniqueEquationSolver { // 6
    public static void main(String[] args) {

        for (int ab = 10; ab < 100; ab++) {

            if (ab % 10 == ab / 10) continue;

            for (int cd = 10; cd < 100; cd++) {

                if (cd % 10 == cd / 10) continue;

                int ef = ab - cd;
                if (ef < 10 || ef > 99) continue;
                if (ef % 10 == ef / 10) continue;

                for (int gh = 10; gh < 100; gh++) {
                    if (gh % 10 == gh / 10) continue;

                    int ppp = ef + gh;
                    if (ppp < 100 || ppp > 999) continue;

                    if (unique(ab, cd, ef, gh, ppp)) {
                        System.out.printf("Solution: AB=%d, CD=%d, EF=%d, GH=%d, PPP=%d%n", ab, cd, ef, gh, ppp);
                    }
                }
            }
        }
    }

    public static boolean unique(int... args) {
        int[] digitCount = new int[10];

        for (int num : args) {
            while (num > 0) {
                int digit = num % 10;
                if (digitCount[digit] > 0) return false;
                digitCount[digit]++;
                num /= 10;
            }
        }
        return true;
    }

    public static boolean allSame(int n) {
        int digit = n % 10;

        while (n > 0) {
            if (n % 10 != digit) return false; 
            n /= 10;
        }
        return true;
    }
}
```
- [Full code](src/midexam/UniqueEquationSolver.java)

---

**Check the full repository here**: [Java Projects Repository](https://github.com/Al-rimi/java)
