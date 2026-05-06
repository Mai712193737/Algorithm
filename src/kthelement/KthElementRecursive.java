package kthelement;

public class KthElementRecursive {

    public static int findElement(int[] arr1, int n1, int p1,
                                  int[] arr2, int n2, int p2, int k) {
        if (n1 > n2)
            return findElement(arr2, n2, p2, arr1, n1, p1, k);
        if (n1 == 0)
            return arr2[p2 + k - 1];
        if (k == 1)
            return Math.min(arr1[p1], arr2[p2]);

        int i = Math.min(n1, k / 2);
        int j = k - i;

        if (arr1[p1 + i - 1] < arr2[p2 + j - 1])
            return findElement(arr1, n1 - i, p1 + i, arr2, n2, p2, k - i);
        else
            return findElement(arr1, n1, p1, arr2, n2 - j, p2 + j, k - j);
    }
}