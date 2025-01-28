package org.example.Queues;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int count = 0;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        count++;
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        count --;
        return stack2.pop();

    }

    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        if(count==0){
            return true;
        }
        return false;
    }
}

