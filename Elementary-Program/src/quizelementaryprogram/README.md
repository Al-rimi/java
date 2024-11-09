# Quiz Elementary Program - Advanced Exercises

This directory contains Java programs focused on advanced algorithmic problems, designed to enhance the understanding of algorithms and computational problem-solving. Each program is suitable for students looking to deepen their knowledge in algorithm design and efficiency.

## Programs in this Directory

### 1. **PrimeNumbers.java**

**Imports**: `java.util.Scanner`

- **Purpose**: This program finds and displays all prime numbers up to a specified limit (n ≤ 1,000,000), allowing users to observe prime distribution within the range.

- **Explanation**: 
  1. The program prompts users to enter the upper limit for finding prime numbers.
  2. It uses a method called `isPrime()` to check each number's primality by iterating from 2 up to the square root of the number.
  3. Prime numbers are printed in rows of 10 for easy readability, and a final count of prime numbers within the range is displayed.

- **Example Input**:
  ```
  Enter the upper limit for prime numbers: 100
  ```

- **Example Output**:
  ```
  Prime numbers up to 100:
  2  3  5  7  11  13  17  19  23  29
  31  37  41  43  47  53  59  61  67  71
  73  79  83  89  97
  
  The number of primes is 25
  ```

### 2. **ClosestPair.java**

**Imports**: `java.util.Scanner`, `java.util.Arrays`

- **Purpose**: This program identifies the two closest points from a set of 2D coordinates using a brute-force approach, calculating the distance between every possible pair to find the minimum distance.

- **Explanation**: 
  1. Users are asked to input the number of points and the (x, y) coordinates for each point.
  2. The program stores these coordinates in a 2D array and iterates through all pairs to calculate the Euclidean distance between them.
  3. It keeps track of the closest pair by comparing distances, and finally displays the coordinates of the two closest points and the calculated distance.

- **Example Input**:
  ```
  Enter the number of points: 5
  Enter point 1 (x y): 1 2
  Enter point 2 (x y): 4 6
  Enter point 3 (x y): 7 8
  Enter point 4 (x y): 1 1
  Enter point 5 (x y): 3 3
  ```

- **Example Output**:
  ```
  Closest points: (1, 2) and (3, 3)
  Distance between them: 2.24
  ```

## How to Run

1. Download or clone the repository.
2. Compile and run the Java files with:
   ```bash
   javac <ProgramName>.java
   java <ProgramName>
   ```

## Conclusion

These programs offer algorithmic challenges that require a solid understanding of computational efficiency and problem-solving, making them excellent exercises for students preparing for competitive programming or advanced algorithm courses. By working through these examples, students will develop skills in optimization and algorithmic thinking, gaining insights into prime number generation and spatial data analysis.

--- 

For any questions or issues, refer to the main repository: [Java Projects Repository](https://github.com/Al-rimi/java).
