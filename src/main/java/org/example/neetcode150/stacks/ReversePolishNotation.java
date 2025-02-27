package org.example.neetcode150.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        String[] operands = {"+", "-", "/", "*"};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (!Arrays.stream(operands).toList().contains(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                String curr = tokens[i];
                int val2 = stack.pop();
                int val1 = stack.pop();

                if (curr.equals("+")) {
                    stack.push(val1 + val2);
                } else if (curr.equals("-")) {
                    stack.push(val1 - val2);
                } else if (curr.equals("*")) {
                    stack.push(val1 * val2);
                } else if (curr.equals("/")) {
                    stack.push(val1 / val2);
                }

            }
        }
        return stack.pop();
    }
}
