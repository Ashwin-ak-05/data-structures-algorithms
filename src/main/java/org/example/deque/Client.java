package org.example.deque;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] result = slidingWindow.maxSlidingWindow(arr,3);
        for (int i = 0; i < result.length; i++) {
            //int i1 = result[i];
            System.out.print(result[i] + " ");

        }


        

    }
}
