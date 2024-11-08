# Rectangle Class

This program defines a `Rectangle` class with methods to calculate its area and perimeter. It demonstrates basic OOP principles, including constructors, instance variables, and methods.

## Class Details

- **Fields**: `width`, `height` (default value: 1 for each)
- **Methods**: 
  - `getArea()`: Calculates and returns the area.
  - `getPerimeter()`: Calculates and returns the perimeter.
  - Accessor methods for `width` and `height`.

## Usage

```java
Rectangle rect1 = new Rectangle(4, 3);
Rectangle rect2 = new Rectangle(4.5, 3.71);
System.out.printf("Rectangle 1 - Width: %.2f, Height: %.2f, Area: %.2f, Perimeter: %.2f%n", 
    rect1.getWidth(), rect1.getHeight(), rect1.getArea(), rect1.getPerimeter());
System.out.printf("Rectangle 2 - Width: %.2f, Height: %.2f, Area: %.2f, Perimeter: %.2f%n", 
    rect2.getWidth(), rect2.getHeight(), rect2.getArea(), rect2.getPerimeter());
```

## Sample Output

```
Rectangle 1 - Width: 4.00, Height: 3.00, Area: 12.00, Perimeter: 14.00
Rectangle 2 - Width: 4.50, Height: 3.71, Area: 16.70, Perimeter: 16.42
```

---