package org.example.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode h) {
       // ListNode t = h;

        if( h.next == null){
            return h;
        }

        ListNode rh = null;

        while (h!=null){
            ListNode t=h;
            h = h.next;
            t.next=rh;
            rh = t;
        }
        return rh;
    }
}
