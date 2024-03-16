package java_methods;

import java.util.Scanner;

public class Methods_in_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Determine the largest and smallest numbers
        double largest = Math.max(Math.max(num1, num2), num3);
        double smallest = Math.min(Math.min(num1, num2), num3);

        // Display the results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.printf("%.2f is your largest and %.2f is your smallest number.%n", largest, smallest);

        scanner.close();
    }
}
