package org.example.LinkedList;

import javax.swing.*;
import java.util.List;

public class ReorderList {
    public ListNode reorderList(ListNode head) {

        if(head == null || head.next.next==null){
            return head;
        }


        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode h2 = slow.next;


        ListNode rh = null;
        ListNode temp = h2;

        while (h2!=null){
            temp = h2;
            h2 = h2.next;
            temp.next = rh;
            rh = temp;
        }

        ListNode firstHalf = head;
        ListNode secondHalf = rh;
        ListNode t = firstHalf;
        while ( secondHalf != null){
          t = head.next;
          head.next = secondHalf;
          head = t;

          t = secondHalf.next;
            secondHalf.next = head;
            secondHalf = t;

        }

//        printLinkedList(firstHalf);
//        printLinkedList(secondHalf);

        return firstHalf;

    }

    public  void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
