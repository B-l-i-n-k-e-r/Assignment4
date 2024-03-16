package com.vince;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter base and height
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.printf("The area of the triangle is: %.2f%n", area);

        scanner.close();
    }
}
