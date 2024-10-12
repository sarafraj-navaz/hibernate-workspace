package all_Sortting_Program;

import java.util.Arrays;

public class MergerSort {
    public static void mergeSort(int[] a, int s, int e) {
        if (s >= e) {
            return;
        }
//        int mid = (s + e) / 2;
        int mid=s+(e-s)/2;
        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        merged(a, s, mid, e);
    }

    public static void merged(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int x = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j]) {
                temp[x++] = a[i++];
            } else {
                temp[x++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[x++] = a[i++];
        }

        while (j <= end) {
            temp[x++] = a[j++];
        }

        for (int k = 0; k < temp.length; k++) {
            a[start + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] a = {6, 3, 9, 5, 2, 8};
        mergeSort(a, 0, a.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
