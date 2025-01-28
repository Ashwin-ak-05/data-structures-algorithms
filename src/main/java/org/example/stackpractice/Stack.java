package org.example.stackpractice;

public class Stack {
    class Node {
        int data;
        Node next;

        Node(int x){
            this.data = x;
        }
    }

    Node head;
    int count;
    Stack(){
        head =  null;
        count = 0;
    }

    void push(int x){
        Node newNode = new Node(x);

        if(head ==  null){
            head = newNode;
        }
        else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
        }
        count ++;
    }

    int pop(){
        if(head == null){
            return -1;
        }
        else{
            int x = head.data;
            head = head.next;
            count --;
            return x;
        }
    }

    int peek(){
        if(head == null){
            return -1;
        }
        return head.data;
    }

    int size(){
        return count;
    }


}
