package org.example.Arrays;

import java.util.Scanner;

public class CountEvenInArrays {
    int[] prefix_sum;

    void countEven(int[] arr) {
        int n = arr.length;
        prefix_sum = new int[n];
        if (arr[0] % 2 == 0) {
            prefix_sum[0] = 1;
        }

        for (int i = 1; i < n; i++) {
            int current_bit = 0;
            if (arr[i] % 2 == 0) {
                current_bit = 1;
            }
            prefix_sum[i] = prefix_sum[i - 1] + current_bit;
            System.out.println(prefix_sum[i]);
        }
        queries(5);
    }

    void queries(int Q) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < Q; i++) {
            System.out.println("Enter l");
            int l = scanner.nextInt();
            System.out.println("Enter r");
            int r = scanner.nextInt();

            if (l == 0) {
                System.out.println("Count -> " + prefix_sum[r]);
            } else {
                System.out.println("Count -> " + (prefix_sum[r] - prefix_sum[l - 1]));
            }

        }
    }
}
