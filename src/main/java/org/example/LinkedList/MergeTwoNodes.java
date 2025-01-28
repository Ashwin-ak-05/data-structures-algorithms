package org.example.LinkedList;

public class MergeTwoNodes {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode h = null;
        ListNode t = null;

        if(h1 == null){
            return h2;
        }
        if(h2 == null){
            return h1;
        }

        if(h1.data > h2.data){
            h = h2;
            t = h2;
            h2 = h2.next;
        }
        else {
            h = h1;
            t = h1;
            h1 = h1.next;
        }

        while(h1 != null && h2 != null){
            if(h1.data < h2.data){
                t.next = h1;
                h1 = h1.next;
                t = t.next;
            }
            else{
                t.next = h2;
                h2 = h2.next;
                t = t.next;
            }

        }

        if(h1 != null){
            t.next = h1;
        }
        if(h2 != null){
            t.next = h2;
        }
        return t;


    }
}
