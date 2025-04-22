package org.example.Scaler.Stacks;

import java.util.HashSet;
import java.util.Stack;

public class RedundantBraces {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> hs = new HashSet<>();
        hs.add('+');
        hs.add('-');
        hs.add('*');
        hs.add('/');
        hs.add('^');
        hs.add('(');

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (hs.contains(ch)) {
                stack.push(ch);
            }
            if (ch == ')') {
                char last = stack.peek();
                if (last == '(') {
                    return 1;
                }
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                }
                stack.pop();
            }
        }

        return 0;
    }
}
