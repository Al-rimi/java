package classesandobjects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numerator and denominator for the first fraction:");
        int num1 = scanner.nextInt();
        int den1 = scanner.nextInt();

        System.out.println("Enter numerator and denominator for the second fraction:");
        int num2 = scanner.nextInt();
        int den2 = scanner.nextInt();

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
            System.err.println(e.getMessage());
        }
    }
}
