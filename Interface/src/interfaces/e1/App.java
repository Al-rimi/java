package interfaces.e1;

public class App {
    public static void main(String[] args) {
        Computable circle = new Circle(5);
        Computable rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.calArea());
        System.out.println("Circle Perimeter: " + circle.calPerimeter());
        System.out.println("Rectangle Area: " + rectangle.calArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calPerimeter());
    }
}
