package kthelement;

public class KthElementIterative {

    public static int findKthElement(int[] arr1, int m, int[] arr2, int n, int k) {
        int i = 0, j = 0, count = 0, element = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j])
                element = arr1[i++];
            else
                element = arr2[j++];
            if (++count == k) return element;
        }
        while (i < m) {
            element = arr1[i++];
            if (++count == k) return element;
        }
        while (j < n) {
            element = arr2[j++];
            if (++count == k) return element;
        }
        return -1;
    }
}