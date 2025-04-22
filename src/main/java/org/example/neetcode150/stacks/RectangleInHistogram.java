package org.example.neetcode150.stacks;


import java.util.Arrays;
import java.util.Stack;

public class RectangleInHistogram {
    public int largestRectangleArea(int[] arr) {
        int[] L = leftMinimumIndex(arr);
        int[] R = rightMinimumIndex(arr);
        int ans = 0;

        for(int i = 0; i < arr.length; i++ ){
            int height = arr[i];
            int width = R[i] - L[i] - 1;
            ans = Math.max(ans,height * width);
        }

        return ans;
    }

    public int[] leftMinimumIndex(int[] arr){
        int[] leftArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(leftArr, -1);

        for(int i = 0; i < arr.length; i++){

            while(!stack.empty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(!stack.empty()){
                leftArr[i] = stack.peek();
            }

            stack.push(i);
        }

        return leftArr;

    }

    public int[] rightMinimumIndex(int[] arr){
        int[] rightArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(rightArr, rightArr.length);

        for(int i = arr.length-1; i >=0; i--){

            while(!stack.empty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(!stack.empty()){
                rightArr[i] = stack.peek();
            }

            stack.push(i);
        }

        return rightArr;
    }
}
