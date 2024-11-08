# Fan Class

This program defines a `Fan` class, modeling a fan with adjustable speed, color, radius, and operational state.

## Class Details

- **Fields**: `speed`, `on`, `radius`, `color`
- **Constants**: `SLOW`, `MEDIUM`, `FAST` (representing fan speeds)
- **Methods**: 
  - Accessor and mutator methods for each field.
  - `toString()`: Returns a description of the fan's state.

## Usage

```java
Fan fan1 = new Fan();
fan1.setSpeed(Fan.FAST);
fan1.setRadius(10);
fan1.setColor("yellow");
fan1.setOn(true);

Fan fan2 = new Fan();
fan2.setSpeed(Fan.MEDIUM);
fan2.setRadius(5);
fan2.setColor("blue");
fan2.setOn(false);

System.out.println("Fan 1: " + fan1);
System.out.println("Fan 2: " + fan2);
```

## Sample Output

```
Fan 1: 
Color: yellow
Radius: 10
Status: on 
Speed: 3

Fan 2: 
Color: blue
Radius: 5
Status: off
```

---