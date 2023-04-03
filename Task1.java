import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = { 10, 4, 6, 4, 8, -13, 2, 3 };
        array = mergesort(array);
        System.out.println(java.util.Arrays.toString(array));
    }

    public void sort(int[] values) {
        int[] sortedValues = mergesort(values);
        for (int i = 0; i < values.length; i++) {
            values[i] = sortedValues[i];
        }
    }

    public static int[] mergesort(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return arr;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, n / 2));
        int[] right = mergesort(Arrays.copyOfRange(arr, n / 2, n));
        return merge(left, right);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int n = n1 + n2, i1 = 0, i2 = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if (i1 == n1) {
                arr[i] = arr2[i2++];
            } else if (i2 == n2) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }
}