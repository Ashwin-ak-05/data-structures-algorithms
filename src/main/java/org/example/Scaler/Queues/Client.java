package org.example.Scaler.Queues;

public class Client {
    public static void main(String[] args) {
        MaximumSlidingWindow maximumSlidingWindow = new MaximumSlidingWindow();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ans = maximumSlidingWindow.maxSlidingWindow(nums,k);
    }
}
