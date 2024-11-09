# **Elementary Programming - Array and Method Exercises**

This repository contains a series of exercises that cover fundamental array and method operations in programming. Below is a detailed explanation of each exercise, along with the expected input/output for each program. 

---

## **Ex1: Scores Above and Below Average**

**Objective**: Write a program that reads an unspecified number of scores and determines how many scores are above or equal to the average, and how many scores are below the average. Enter a negative number to signify the end of the input.

### **Sample Output:**
```
Enter scores: 
50 60 70 80 90 -1

Average score: 70
Scores above or equal to average: 3
Scores below average: 2
```

**[Java class: `ScoresAboveBelowAverage`](./src/arraymethod/ScoresAboveBelowAverage.java)**

---

## **Ex2: Reverse an Array**

**Objective**: Write a method that returns an array which is the reversal of the given array.

```java
public static int[] reverse(int[] arr);
```

### **Sample Output:**
```
Enter 10 numbers: 
1 2 3 4 5 6 7 8 9 10

Reversed array: 
10 9 8 7 6 5 4 3 2 1
```

**[Java class: `ReverseArray`](./src/arraymethod/ReverseArray.java)**

---

## **Ex3: Sum of Integers**

**Objective**: Write a program that accepts an unspecified number of integers and displays their total. 

### **Sample Output:**
```
Enter numbers (0 to terminate): 
5 10 15 20 0

Total sum: 50
```

**[Java class: `SumIntegers`](./src/arraymethod/SumIntegers.java)**

---

## **Ex4: Consecutive Numbers in Array**

**Objective**: Write a method that tests whether the array has four consecutive numbers with the same value.

### **Sample Output:**
```
Enter array size: 
8
Enter array elements: 
1 2 2 2 2 3 4 5

Output: The array has consecutive fours.
```
```
Enter array size: 
6
Enter array elements: 
1 1 2 2 3 3

Output: The array has no consecutive fours.
```

**[Java class: `ConsecutiveNumbers`](./src/arraymethod/ConsecutiveNumbers.java)**

---

## **Ex5: Partition an Array**

**Objective**: Write a method that partitions the list using the first element, called a pivot.

```java
public static int partition(int[] list);
```

### **Sample Output:**
```
Enter list size: 
8
Enter list elements: 
10 1 5 16 61 9 11 1

Partitioned list:
1  5  1  9  10  61  11  16
```

**[Java class: `ArrayPartition`](./src/arraymethod/ArrayPartition.java)**

---

## **Ex6: Check if Matrix is a Positive Markov Matrix**

**Objective**: Write a method to check whether a matrix is a positive Markov matrix, where each element is positive and the sum of each column is 1.

```java
public static Boolean isMarkovMatrix(double[][] m);
```

### **Sample Output:**
```
Enter 3x3 matrix:
0.15  0.875  0.375
0.55  0.005  0.225
0.30  0.120  0.400

Output: It is a Markov matrix.
```

```
Enter 3x3 matrix:
0.95  -0.875  0.375
0.65  0.005  0.225
0.30  0.220  0.400

Output: It is not a Markov matrix.
```

**[Java class: `MarkovMatrixCheck`](./src/arraymethod/MarkovMatrixCheck.java)**

---

## **Ex7: Maximum Square Submatrix of 1s**

**Objective**: Given a matrix of 0s and 1s, find the maximum square submatrix of 1s. 

```java
public static int[] findLargestBlock(int[][] m);
```

### **Sample Output:**
```
Enter matrix size:
5
Enter matrix elements:
1 0 1 0 1
1 1 1 0 1
1 0 1 1 1
1 0 1 1 1
1 0 1 1 1

Output: The maximum square submatrix is at (2, 2) with size 3.
```

**[Java class: `SquareSubmatrix`](./src/arraymethod/SquareSubmatrix.java)**

---

## **Ex8: Latin Square**

**Objective**: Write a program to check if an input array of characters is a Latin square. A Latin square is an n-by-n matrix filled with n different letters, each occurring exactly once in each row and column.

### **Sample Output:**
```
Enter number n: 4
Enter 4 rows of letters:
A B C D
B A D C
C D B A
D C A B

Output: The input array is a Latin square.
```

```
Enter number n: 3
Enter 3 rows of letters:
A F D

Output: Wrong input: the letter must be from A to C.
```

**[Java class: `LatinSquareCheck.`](./src/arraymethod/LatinSquareCheck.java)**

---

## **Conclusion**

These exercises are designed to strengthen the fundamentals of array manipulation, logic, and matrix operations. They provide opportunities to practice implementing common algorithmic techniques, such as reversing arrays, checking conditions, and performing matrix operations.

---

**Check the full repository here**: [Java Projects Repository](https://github.com/Al-rimi/java)
