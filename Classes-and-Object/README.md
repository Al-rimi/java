# Lab 2: Classes and Objects

### Introduction
A fraction (from Latin *fractus*, "broken") represents a part of a whole or, more generally, any number of equal parts. When spoken in everyday English, a fraction describes how many parts of a certain size there are, for example, one-half, eight-fifths, three-quarters.

A common, vulgar, or simple fraction (examples: 1/2 and 17/3) consists of a numerator displayed above a line (or before a slash like 1⁄2), and a non-zero denominator, displayed below (or after) that line. Numerators and denominators are also used in fractions that are not common, including compound fractions, complex fractions, and mixed numerals.

In positive common fractions, the numerator and denominator are natural numbers. The numerator represents a number of equal parts, and the denominator indicates how many of those parts make up a unit or a whole. The denominator cannot be zero, because zero parts can never make up a whole. For example, in the fraction 3/4, the numerator 3 indicates that the fraction represents 3 equal parts, and the denominator 4 indicates that 4 parts make up a whole.

<br>

The picture below illustrates 3/4 of a cake:
<div style="text-align: center; width: 100%;">
  <img src="./resources/cake_fraction.png" alt="Output Screenshot" style="width: 100%;">
</div>

<details>
<summary>Fig. 1</summary>

A cake with one quarter (one fourth) removed. The remaining three fourths are shown by dotted lines and labeled by the fraction 1/4.

</details>

<br>

A common fraction is a numeral that represents a rational number. That same number can also be represented as a decimal, a percent, or with a negative exponent. For example, 0.01, 1%, and 10⁻² are all equal to the fraction 1/100. An integer can be thought of as having an implicit denominator of one (for example, 7 equals 7/1).

<br>

### Arithmetic with Fractions
```
1/2 + 1/3 = (3/2 * 3) + (2/3 * 2) = 3/6 + 2/6 = 5/6
```

### Subtraction
```
1/2 - 1/3 = (3/2 * 3) - (2/3 * 2) = 3/6 - 2/6 = 1/6
```

### Multiplication
```
1/2 * 1/3 = 1/2 * 1/3 = 1/6
```

### Division
```
1/2 ÷ 1/3 = 1/2 * 3/1 = 3/2
```

### Comparison
```
1/2 > 1/3
```

<br>

## Tasks
1. **Design a class named `Fraction`** that describes a fraction. Assume the numerator and denominator are natural numbers.
   - Design attributes to represent a fraction clearly.
   - Design behaviors to perform addition, subtraction, multiplication, division, and comparison.
   - Overload constructors to create objects easily.

2. **Create an application** to check if the Java class `Fraction` is functional.

### Sample Output

#### Example 1:
**Input**:  
```
1 2 1 3
```
**Output**:  
```
1/2 + 1/3 = 5/6  
1/2 - 1/3 = 1/6  
1/2 * 1/3 = 1/6  
1/2 ÷ 1/3 = 3/2
```

#### Example 2:
**Input**:  
```
1 2 0 1
```
**Output**:  
```
1/2 + 0 = 1/2  
1/2 - 0 = 1/2  
1/2 * 0 = 0  
Exception: Division by zero
```

#### Example 3:
**Input**:  
```
1 0 1 3
```
**Output**:  
```
The denominator cannot be zero.
```

<br>

## Code:

#### Class `Fraction`

```java
package classesandobjects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("The denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction other) {
        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction subtract(Fraction other) {
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction multiply(Fraction other) {
        int num = this.numerator * other.numerator;
        int den = this.denominator * other.denominator;
        return new Fraction(num, den);
    }

    public Fraction divide(Fraction other) {
        int num = this.numerator * other.denominator;
        int den = this.denominator * other.numerator;
        return new Fraction(num, den);
    }

    public boolean isGreaterThan(Fraction other) {
        return this.numerator * other.denominator > other.numerator * this.denominator;
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if(denominator < 0){
            denominator *= -1;
            numerator *= -1;
        }
    }

    // Find the greatest common divisor (GCD) using Euclidean algorithm
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
```

<br>

#### Class `Test`
```java
package classesandobjects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter numerator and denominator (num1 den1 num2 den2): ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int num1 = Integer.parseInt(parts[0]);
        int den1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        int den2 = Integer.parseInt(parts[3]);

        scanner.close();

        try {
            Fraction fraction1 = new Fraction(num1, den1);
            Fraction fraction2 = new Fraction(num2, den2);

            System.out.println(fraction1 + " + " + fraction2 + " = " + fraction1.add(fraction2));
            System.out.println(fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2));
            System.out.println(fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2));
            System.out.println(fraction1 + " ÷ " + fraction2 + " = " + fraction1.divide(fraction2));
            System.out.println(fraction1 + " > " + fraction2 + " = " + fraction1.isGreaterThan(fraction2));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
```

<br>

## Output:

<div style="text-align: center; width: 100%;">
    <img src="./resources\Screenshot.png" alt="Screenshot" style="width: 100%;">
  </div>

<br>
<br>

## New Concepts

> ###### Error Handling with `try-catch` in Java and Greatest Common Divisor (GCD) Algorithm and explained in detail, supported by examples.


### 1. **Error Handling with `try-catch` in Java**  

In Java, the **`try-catch` block** is used to handle exceptions, ensuring the program runs smoothly even when errors occur. This was particularly useful in this lab to handle invalid fractions, such as a denominator of zero.

### Syntax  

```java
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Handle the exception
}
```

### Code Example  

```java
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter numerator and denominator (num den):");
    int num = scanner.nextInt();
    int den = scanner.nextInt();

    Fraction fraction = new Fraction(num, den);
    System.out.println("Fraction: " + fraction);
```

### Explanation  
When creating a fraction with a denominator of zero, the program throws an **`IllegalArgumentException`**, which is caught in the `catch` block, preventing the program from crashing.  

### Output for Invalid Input  

**Input**:  
```java
1 0
```

**Output**:  
```
Error: The denominator cannot be zero.
```

<br>

### 2. **Greatest Common Divisor (GCD) Algorithm**  

The **Greatest Common Divisor** is the largest integer that divides two numbers without leaving a remainder. This recursive algorithm is efficient and works recursively using the relation:  

```
GCD(a, b) = GCD(b, a % b)
```  

### Implementation Steps  
1. If `b = 0`, the GCD is `a`.  
2. Otherwise, recursively call the function with `b` and `a % b`.  

### Code Example  

```java
private int gcd(int a, int b) {
    if (b == 0) return a;  // Base case: when b is 0, a is the GCD
    return gcd(b, a % b);  // Recursive step
}
```

### How It Works  
Let’s find the GCD of `48` and `18`:  

1. \( GCD(48, 18) \)  
   - \( 48 \mod 18 = 12 \), so call \( GCD(18, 12) \).  
2. \( GCD(18, 12) \)  
   - \( 18 \mod 12 = 6 \), so call \( GCD(12, 6) \).  
3. \( GCD(12, 6) \)  
   - \( 12 \mod 6 = 0 \), so return \( GCD = 6 \).  

### Practical Usage in Fractions 

```java
public void simplify() {
    int gcd = gcd(numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
}
```

## Summary  

- **Error Handling**: The `try-catch` mechanism in Java ensures that invalid inputs (e.g., zero denominators) are handled gracefully, maintaining program stability.  
- **GCD Algorithm**: Simplifies fractions by finding the largest divisor of the numerator and denominator. It’s efficient and recursive, ensuring fractions are always in their simplest form.

<br>

> Feel free to visit my Java repository [here](https://github.com/Al-rimi/java) thanks.
