package org.example.stackpractice;

import java.util.Stack;

public class InfixToPostfix {
    public String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        String postFix = "";
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (Character.isLetterOrDigit(curr)) {
                postFix = postFix + curr;
            } else if (curr == '(') {
                stack.push(curr);
            } else {

                if (curr == ')') {
                    while (!stack.isEmpty() && !(stack.peek() == '(')) {
                        postFix = postFix + stack.pop();
                    }
                    stack.pop();
                } else {
                    if (stack.isEmpty() || priorityOf(curr) > priorityOf(stack.peek())) {
                        stack.push(curr);
                    } else {
                        while (!stack.isEmpty() && !(priorityOf(curr) > priorityOf(stack.peek()))) {
                            postFix = postFix + stack.pop();
                        }
                        stack.push(curr);
                    }
                }


            }
        }

        while (!stack.isEmpty()) {
            postFix = postFix + stack.pop();
        }
        return postFix;
    }

    public int priorityOf(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        }
        return -1;
    }
}
