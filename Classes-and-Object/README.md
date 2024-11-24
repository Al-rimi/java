# Lab 2: Classes and Objects

**Student ID**:  
**Name**:  
**Grade**:  

---

## Introduction

A fraction (from Latin *fractus*, "broken") represents a part of a whole or, more generally, any number of equal parts. When spoken in everyday English, a fraction describes how many parts of a certain size there are, for example: one-half, eight-fifths, three-quarters.  

A **common, vulgar, or simple fraction** (examples: 1/2 and 17/3) consists of:
- A **numerator** displayed above a line (or before a slash like 1⁄2).
- A **non-zero denominator**, displayed below (or after) that line.

Numerators and denominators are also used in fractions that are not common, including compound fractions, complex fractions, and mixed numerals.

In **positive common fractions**, the numerator and denominator are natural numbers:
- The **numerator** represents the number of equal parts.
- The **denominator** indicates how many of those parts make up a unit or a whole.  
  > **Note**: The denominator cannot be zero, because zero parts can never make up a whole.

For example, in the fraction `3/4`:
- The numerator (`3`) indicates that the fraction represents 3 equal parts.
- The denominator (`4`) indicates that 4 parts make up a whole.

### Example Illustration
Below is an illustration of the fraction `3/4` of a cake:

![A cake with one quarter removed. The remaining three-fourths are shown by dotted lines and labeled by the fraction 1/4.](./screenshots/Screenshot2.png)

A **common fraction** is a numeral that represents a **rational number**. The same number can also be represented as:
- A **decimal**: e.g., `0.01`.
- A **percent**: e.g., `1%`.
- A **negative exponent**: e.g., `10⁻²`.

For example: `1/100`, `0.01`, `1%`, and `10⁻²` are all equal.

An **integer** can be thought of as having an implicit denominator of one (e.g., `7` equals `7/1`).

---

## Arithmetic with Fractions

### Addition
**Example**:  
`1/2 + 1/3 = (3 / (2 * 3)) + (2 / (3 * 2)) = 3/6 + 2/6 = 5/6`

### Subtraction
**Example**:  
`1/2 - 1/3 = (3 / (2 * 3)) - (2 / (3 * 2)) = 3/6 - 2/6 = 1/6`

### Multiplication
**Example**:  
`1/2 * 1/3 = (1 * 1) / (2 * 3) = 1/6`

### Division
**Example**:  
`1/2 ÷ 1/3 = (1 / 2) * 3 = 3/2`

### Comparison (`>`)
**Example**:  
`1/2 > 1/3`

---

## Tasks

### 1. Design a class named `Fraction` to describe a fraction.  
Assume the numerator and denominator are natural numbers.

1. **Attributes**:
   - Design attributes to clearly represent a fraction.
2. **Behaviors**:
   - Implement methods to perform **addition**, **subtraction**, **multiplication**, **division**, and **comparison**.
3. **Constructors**:
   - Overload constructors to create objects easily.

---

### 2. Create an application to test the `Fraction` class.
Check if the Java class `Fraction` is implemented correctly.

#### Sample Output

The sample output format is provided for reference. Feel free to adjust the output format as long as it remains clear.

**Sample Input**:
```
1 2 1 3
```

**Sample Output**:
```
1/2 + 1/3 = 5/6
1/2 - 1/3 = 1/6
1/2 * 1/3 = 1/6
1/2 / 1/3 = 3/2
```

**Sample Input**:
```
1 2 0 1
```

**Sample Output**:
```
1/2 + 0 = 1/2
1/2 - 0 = 1/2
1/2 * 0 = 0
Exception / By zero
```

---

**Sample Input**:
```
1 0 1 3
```

**Sample Output**:
```
The denominator cannot be zero.
```
