package org.example.LinkedList;

public class CloneLinkedList {
    class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }


    public Node copyRandomList(Node head) {
        Node t = head;

        while(t != null){
            Node newNode = new Node(t.val);
            newNode.next = t.next;
            t.next = newNode;
            t = newNode.next;
        }

        Node t1 = head;
        Node t2 = head.next;

        while(t1 != null){

            if(t1.random != null){
                t2.random = t1.next.random;
                t1 = t2.next;
                if(t1 != null){
                    t2 = t1.next;
                }


            }
            t1 = t2.next;
            if(t1 != null){
                t2 = t1.next;
            }



        }

        Node clone = head;
        t1 = head;
        t2 = clone;

        while (t1 !=  null){
            t1.next = t2.next;
            t1 = t.next;

            if(t1 != null){
                t2.next = t1.next;
            }
            t2 = t2.next;
        }

        return clone;
    }
}
