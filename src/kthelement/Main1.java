package kthelement;

public class Main1 {

    public static void main(String[] args) {
/*
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k1 = 5;
*/
    int[] arr1 = { 100, 112, 256, 349, 770 };
    int[] arr2 = { 72, 86, 113, 119, 265, 445, 892 };
    int k1 = 7;


        System.out.println("=== Iterative Approach ===");
        System.out.println("The " + k1 + "-th element is: "
                + KthElementIterative.findKthElement(arr1, arr1.length, arr2, arr2.length, k1));

        System.out.println("\n=== Recursive Approach ===");
        System.out.println("Output (k=5):  "
                + KthElementRecursive.findElement(arr1, arr1.length, 0, arr2, arr2.length, 0, k1));

        int[] arr3 = {100, 112, 256, 349, 770};
        int[] arr4 = {72, 86, 113, 119, 265, 445, 892};
        int k2 = 7;
        System.out.println("Output (k=7):  "
                + KthElementRecursive.findElement(arr3, arr3.length, 0, arr4, arr4.length, 0, k2));
    }
}