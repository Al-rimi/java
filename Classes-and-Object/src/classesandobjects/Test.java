package classesandobjects;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter numerator and denominator (num1 den1 num2 den2): ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int num1 = Integer.parseInt(parts[0]);
        int den1 = Integer.parseInt(parts[1]);
        int num2 = Integer.parseInt(parts[2]);
        int den2 = Integer.parseInt(parts[3]);

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
            System.err.println("Error: " + e.getMessage());
        }
    }
}
