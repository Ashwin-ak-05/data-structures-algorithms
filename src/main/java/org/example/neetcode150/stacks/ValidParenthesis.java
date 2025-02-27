package org.example.neetcode150.stacks;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char last = stack.pop();
                if (!match(last, curr)) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public boolean match(char last, char curr) {
        if (curr == '}' && last != '{') {
            return false;
        } else if (curr == ']' && last != '[') {
            return false;
        } else if (curr == ')' && last != '(') {
            return false;
        }

        return true;
    }
}
