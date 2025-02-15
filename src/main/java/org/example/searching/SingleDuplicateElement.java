package org.example.searching;

public class SingleDuplicateElement {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if ((m == 0 || arr[m] != arr[m - 1]) && (m == n - 1 || arr[m] != arr[m + 1])) {
                return arr[m];
            } else if (m == n - 1 || arr[m] == arr[m + 1]) {
                if (m % 2 == 0) {


                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else if (m == 0 || arr[m] == arr[m - 1]) {
                if (m % 2 == 0) {
                    r = m - 1;
                } else {

                    l = m + 1;

                }
            }
        }
        return -1;
    }
}
