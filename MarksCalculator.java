package com.vince;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the lecturer to enter marks for each unit
        System.out.print("Enter marks for Java Programming: ");
        double javaMarks = scanner.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networkingMarks = scanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = scanner.nextDouble();

        // Calculate the average marks
        double averageMarks = (javaMarks + networkingMarks + mathsMarks) / 3;

        // Display the results
        System.out.println("Marks for Java Programming: " + javaMarks);
        System.out.println("Marks for Networking: " + networkingMarks);
        System.out.println("Marks for Maths: " + mathsMarks);
        System.out.printf("The average is: %.2f%n", averageMarks);

        scanner.close();
    }
}
