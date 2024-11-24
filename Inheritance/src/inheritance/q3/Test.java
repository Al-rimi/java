package inheritance.q3;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(15);

        System.out.println(circle1);
        System.out.println(circle2.equals(circle1)); // true
        System.out.println(circle3.equals(circle1)); // false
    }
}
