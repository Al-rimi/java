Here is the content converted into Markdown format:

```markdown
# Object Oriented Programming: Interface and Its Subclasses

## Ex 1: Interface and Its Subclass
An interface is one of the reference types in Java. Although it cannot be used to create objects, it can declare variables, and the variable can refer to the object of its subclass.

- **Task:**
  - Design an interface named `Computable`. The interface has two abstract methods:  
    - `calArea()`, to calculate the area of the specified geometry.
    - `calPerimeter()`, to calculate the perimeter of the specified geometry.
  - Design a class named `Circle`, which implements the interface `Computable` and describes the geometric circle.
  - Design a class named `Rectangle`, which implements the interface `Computable` and describes the geometric rectangle.
  - Design a main class (`Application`) and create some objects to validate your interface and subclasses.

### Code:

#### **Interface `Computable`**
```java
public interface Computable {
    double calArea();
    double calPerimeter();
}
```

#### **Class `Circle`**
```java
public class Circle implements Computable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calPerimeter() {
        return 2 * Math.PI * radius;
    }
}
```

#### **Class `Rectangle`**
```java
public class Rectangle implements Computable {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calArea() {
        return length * width;
    }

    @Override
    public double calPerimeter() {
        return 2 * (length + width);
    }
}
```

#### **Main Class `Application`**
```java
public class Application {
    public static void main(String[] args) {
        Computable circle = new Circle(5.0);
        Computable rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.calArea());
        System.out.println("Circle Perimeter: " + circle.calPerimeter());
        System.out.println("Rectangle Area: " + rectangle.calArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calPerimeter());
    }
}
```

## Ex 2: Inheritance of Interface
A class has only one superclass in Java. However, an interface can have multiple superinterfaces.

- **Task:**
  - Design 3 interfaces: `InterfaceA`, `InterfaceB`, and `InterfaceC`.  
    - See the UML class diagram in Figure 1.
  - Design a class named `ImpClass`. The class `ImpClass` implements the interface `InterfaceC` and has to override all methods from `InterfaceA`, `InterfaceB`, and `InterfaceC`.
  - Design a main class and create objects to invoke its methods.

### Code:

#### **Interfaces**
```java
public interface InterfaceA {
    void methodA();
}

public interface InterfaceB {
    void methodB();
}

public interface InterfaceC extends InterfaceA, InterfaceB {
    void methodC();
}
```

#### **Class `ImpClass`**
```java
public class ImpClass implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("Method A implementation");
    }

    @Override
    public void methodB() {
        System.out.println("Method B implementation");
    }

    @Override
    public void methodC() {
        System.out.println("Method C implementation");
    }
}
```

#### **Main Class**
```java
public class Application {
    public static void main(String[] args) {
        ImpClass obj = new ImpClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
```

## Ex 3: Complex Class
A class can implement multiple interfaces while inheriting from a class. It is called a complex class.

- **Task:**
  - Design an abstract class `Machine` to describe a real machine.
  - Design an interface `Walkable` to describe the behavior: walk.
  - Design an interface `Flyable` to describe the behavior: fly.
  - Design an interface `Swimmable` to describe the behavior: swim.
  - Design a complex class `Robert` which implements `Walkable`, `Flyable`, and `Swimmable` while extending its superclass `Machine`.
  - Write a test program to verify your designs.

### Code:

#### **Abstract Class `Machine`**
```java
public abstract class Machine {
    public abstract void operate();
}
```

#### **Interfaces**
```java
public interface Walkable {
    void walk();
}

public interface Flyable {
    void fly();
}

public interface Swimmable {
    void swim();
}
```

#### **Class `Robert`**
```java
public class Robert extends Machine implements Walkable, Flyable, Swimmable {
    @Override
    public void operate() {
        System.out.println("Robert operating...");
    }

    @Override
    public void walk() {
        System.out.println("Robert is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Robert is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Robert is swimming.");
    }
}
```

#### **Test Program**
```java
public class Application {
    public static void main(String[] args) {
        Robert robert = new Robert();
        robert.operate();
        robert.walk();
        robert.fly();
        robert.swim();
    }
}
```

## Ex 4: Application
Design an animal sound simulator. The simulator can produce all kinds of animal sounds.  
See the UML class diagram in Figure 2.

- **Task:**
  - Design an interface named `Animal`.
  - Design a class named `Simulator`, which has a method `playSound(Animal animal)`.
  - Design some subclasses of `Animal`, such as `Dog`, `Cat`, and `Cow`.
  - Write a test program to verify your designs.

### Code:

#### **Interface `Animal`**
```java
public interface Animal {
    void sound();
}
```

#### **Subclasses**
```java
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo!");
    }
}
```

#### **Class `Simulator`**
```java
public class Simulator {
    public void playSound(Animal animal) {
        animal.sound();
    }
}
```

#### **Test Program**
```java
public class Application {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        simulator.playSound(dog);
        simulator.playSound(cat);
        simulator.playSound(cow);
    }
}
```