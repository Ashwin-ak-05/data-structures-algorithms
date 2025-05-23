package org.example.Scaler.Stacks;

import java.util.Stack;

public class PassingGame {
    public int solve(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();

        stack.push(B);

        for(int i = 0; i<C.length; i++){
            if(C[i]==0){
                stack.pop();
            }
            else{
                stack.push(C[i]);
            }

        }
        return stack.peek();
    }
}
