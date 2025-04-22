package org.example.slidingwindow;

public class SpecialIndex {
    public static int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int[] pse = new int[n];
        int[] pso = new int[n];

        pse[0] = nums[0];
        pso[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pse[i] = pse[i - 1] + nums[i];
                pso[i] = pso[i - 1];

            } else {
                pse[i] = pse[i - 1];
                pso[i] = pso[i - 1] + nums[i];
            }
        }

//        for(int i = 0; i<n;i++){
//            if(i%2==1)
//        }

        for (int i : pso) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : pse) {
            System.out.print(i + " ");
        }


        int count = 0;

        int zero_even = pso[n - 1] - pso[0];
        int zero_odd = pse[n - 1] - pse[0];
        if (zero_even == zero_odd) {
            count++;
        }

        for (int i = 1; i < n; i++) {
            int even = pse[i - 1] + (pso[n - 1] - pso[i]);
            int odd = pso[i - 1] + (pse[n - 1] - pse[i]);

            if (even == odd) {
                count++;
            }
        }

        return count;
    }
}
