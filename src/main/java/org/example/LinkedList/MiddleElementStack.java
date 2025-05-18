package org.example.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class MiddleElementStack {
    class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    class MyStack {
        Node head;  // Top of stack
        Node mid;   // Middle element
        int size;

        MyStack() {
            head = null;
            mid = null;
            size = 0;
        }

        void push(int x) {
            Node newNode = new Node(x);
            if (head == null) {
                head = newNode;
                mid = newNode;
            } else {
                newNode.prev = head;
                head.next = newNode;
                head = newNode;

                if (size % 2 == 1) {
                    mid = mid.next;
                }
            }
            size++;
        }

        int pop() {
            if (size == 0) return -1;

            int value = head.val;
            if (size == 1) {
                head = null;
                mid = null;
            } else {
                head = head.prev;
                head.next = null;
                if (size % 2 == 0) {
                    mid = mid.prev;
                }
            }
            size--;
            return value;
        }

        int returnMid() {
            if (size == 0) return -1;
            return mid.val;
        }

        void removeMid() {
            if (size == 0) return;

            if (size == 1) {
                head = null;
                mid = null;
            } else {
                if (mid.prev != null)
                    mid.prev.next = mid.next;
                if (mid.next != null)
                    mid.next.prev = mid.prev;

                if (size % 2 == 1) {
                    mid = mid.prev;
                } else {
                    mid = mid.next;
                }

                if (mid == null) head = null; // safety
            }

            size--;
        }
    }

    public int[] solve(int[][] A) {
        MyStack stack = new MyStack();
        List<Integer> output = new ArrayList<>();

        for (int[] op : A) {
            int type = op[0];
            int value = op[1];

            switch (type) {
                case 1:
                    stack.push(value);
                    break;
                case 2:
                    output.add(stack.pop());
                    break;
                case 3:
                    output.add(stack.returnMid());
                    break;
                case 4:
                    stack.removeMid();
                    break;
            }
        }

        return output.stream().mapToInt(i -> i).toArray();
    }
}
