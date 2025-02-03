package org.example.backtracking;

public class PrintOneAndTwo {
    void print(int num, int d, int n) {
        if (d == n) {
            System.out.print(num + " ");
            return;
        }

        print(num * 10 + 1, d + 1, n);
        print(num * 10 + 2, d + 1, n);
    }

    void printArr(int[] arr,int i){
        if(i==arr.length){
            for (int i1 : arr) {
                System.out.print(i1);
            }
            System.out.print(" ");

            return;
        }

        arr[i] = 1;
        printArr(arr,i+1);
        arr[i] = 2;
        printArr(arr,i+1);
    }
}
