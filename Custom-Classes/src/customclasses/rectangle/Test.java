package customclasses.rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 3);
        Rectangle rect2 = new Rectangle(4.5, 3.71);

        System.out.println("Rectangle 1:");
        System.out.printf("  Width: %.2f%n", rect1.getWidth());
        System.out.printf("  Height: %.2f%n", rect1.getHeight());
        System.out.printf("  Area: %.2f%n", rect1.getArea());
        System.out.printf("  Perimeter: %.2f%n", rect1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.printf("  Width: %.2f%n", rect2.getWidth());
        System.out.printf("  Height: %.2f%n", rect2.getHeight());
        System.out.printf("  Area: %.2f%n", rect2.getArea());
        System.out.printf("  Perimeter: %.2f%n", rect2.getPerimeter());
    }
}
