package interfaces.e1;

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

