package org.example.sorting;

public class MergeSortedArrayTwo {
    public int[] merge(int[] a, int n, int[] b, int m) {
            int i = n-1;
            int j = m -1;
            int k = n+m-1;

            while (i>=0 && j >=0){
                if(a[i]>b[j]){
                    a[k] = a[i];
                    i--;
                    k--;
                }
                else {
                    a[k] = b[j];
                    j--;
                    k--;
                }
            }

            while (j>=0){
                a[k] = b[j];
                j--;
                k--;
            }
          return a;
    }
}
