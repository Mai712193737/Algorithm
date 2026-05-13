package kthelement;

import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Predefined Test Case
        int[] arr1 = {100, 112, 256, 349, 770};
        int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
        int k1 = 7;

        System.out.println("=== Predefined Test Case ===");

        System.out.println("Iterative Result: "
                + KthElementIterative.findKthElement(
                arr1, arr1.length,
                arr2, arr2.length,
                k1));

        System.out.println("Recursive Result: "
                + KthElementRecursive.findElement(
                arr1, arr1.length, 0,
                arr2, arr2.length, 0,
                k1));

        // User Input
        System.out.println("\n=== User Input ===");

        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();

        int[] userArr1 = new int[n1];

        System.out.println("Enter first sorted array:");
        for (int i = 0; i < n1; i++) {
            userArr1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();

        int[] userArr2 = new int[n2];

        System.out.println("Enter second sorted array:");
        for (int i = 0; i < n2; i++) {
            userArr2[i] = input.nextInt();
        }

        System.out.print("Enter k: ");
        int k2 = input.nextInt();

        // Iterative
        System.out.println("\nIterative Result: "
                + KthElementIterative.findKthElement(
                userArr1, userArr1.length,
                userArr2, userArr2.length,
                k2));

        // Recursive
        System.out.println("Recursive Result: "
                + KthElementRecursive.findElement(
                userArr1, userArr1.length, 0,
                userArr2, userArr2.length, 0,
                k2));

        input.close();
    }
}