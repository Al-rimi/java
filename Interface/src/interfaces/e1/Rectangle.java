package interfaces.e1;

public class Rectangle implements Computable {
    private double length;
    private double width;

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