package org.example.stackpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmaller {
    static List<Integer> leftSmaller(int n, int a[])
    {

        Stack<Integer> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i < n; i++){

            while(!stack.empty() && stack.peek() >= a[i]){
                stack.pop();
            }


            if(stack.empty()){
                ans.add(-1);
            }
            else{
               ans.add(stack.peek());
            }
            stack.push(a[i]);
        }
        return ans;
    }
}
