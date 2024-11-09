# Elementary Program - Core Logic

This directory contains Java source files for basic programming exercises designed to improve problem-solving skills. Each program has a specific task, explanation, and sample input/output for easier understanding and testing.

## Programs in this Directory

### 1. **LeapYear.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Determines if a given year is a leap year using these rules:
  - A leap year is divisible by 4 but not by 100, or it is divisible by 400.
- **Explanation**: The program asks for a year and applies the conditions to check if it’s a leap year.
- **Sample Input**:
  ```
  Enter a year: 2024
  ```
- **Sample Output**:
  ```
  2024 is a leap year.
  ```

### 2. **FutureDay.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Calculates the day of the week for a future date based on today's date.
- **Explanation**: The user inputs the current day (0 for Sunday to 6 for Saturday) and the number of days into the future. The program computes and outputs the day of the week for the future date.
- **Sample Input**:
  ```
  Enter today's day (0 for Sunday, ..., 6 for Saturday): 3
  Enter the number of days to add: 10
  ```
- **Sample Output**:
  ```
  Today is Wednesday, and the future day is Saturday.
  ```

### 3. **CirclePoint.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Checks if a point `(x, y)` is within a circle of radius 10 centered at the origin.
- **Explanation**: The program calculates the distance of the point from the origin using the formula `√(x² + y²)`. If the distance is less than or equal to the radius, the point is inside the circle.
- **Sample Input**:
  ```
  Enter the x coordinate: 3
  Enter the y coordinate: 4
  ```
- **Sample Output**:
  ```
  Point (3, 4) is inside the circle.
  ```

### 4. **PalindromeCheck.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Determines if a given string is a palindrome.
- **Explanation**: The program reverses the input string and compares it to the original. If they match, it’s a palindrome.
- **Sample Input**:
  ```
  Enter a string: racecar
  ```
- **Sample Output**:
  ```
  racecar is a palindrome.
  ```

### 5. **HexToDecimal.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Converts a hexadecimal number into its decimal equivalent.
- **Explanation**: The program takes a hexadecimal string input and converts it using `Integer.parseInt(hex, 16)`.
- **Sample Input**:
  ```
  Enter a hexadecimal number: 1A
  ```
- **Sample Output**:
  ```
  The decimal equivalent of hexadecimal 1A is 26.
  ```

### 6. **Pyramid.java**

**Imports**: `java.util.Scanner`  
- **Purpose**: Prints a centered number pyramid based on the user-defined number of rows.
- **Explanation**: For each row, the program prints a descending sequence of numbers from the row number to 1, followed by an ascending sequence back to the row number.
- **Sample Input**:
  ```
  Enter the number of rows: 4
  ```
- **Sample Output**:
  ```
       1
     2 1 2
   3 2 1 2 3
 4 3 2 1 2 3 4
  ```

## How to Run

1. Download or clone the repository.
2. Compile and run each Java file with the following commands:
   ```bash
   javac <ProgramName>.java
   java <ProgramName>
   ```

## Conclusion

These programs provide a hands-on approach to learning basic Java programming, focusing on logic and problem-solving. Feel free to modify or build upon these exercises to deepen your understanding and create more advanced applications.

--- 

For any questions or issues, refer to the main repository: [Java Projects Repository](https://github.com/Al-rimi/java).
