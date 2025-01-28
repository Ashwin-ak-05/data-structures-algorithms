package org.example.LinkedList;

public class InsertNode {

    public Node insertAtEnd(Node head, int x, int v) {
        int n = 0;
        Node t = head;

//        while(t!=null){
//            n++;
//            t = t.next;
//        }

        int i = 1;
        while (i < x - 1 && t.next != null) {
            t = t.next;
            i++;
        }

        Node newNode = new Node(v);

        newNode.next = t.next;
        t.next = newNode;

        //System.out.println("Length - "+n);

       return head;
    }
}
