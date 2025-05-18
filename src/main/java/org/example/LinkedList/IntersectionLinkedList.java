package org.example.LinkedList;

public class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = 0;
        int countB = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while (temp1 != null) {
            countA++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            countB++;
            temp2 = temp2.next;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;
        if (countA > countB) {
            int count = countA - countB;
            while (count != 0) {
                p1 = p1.next;
                count--;
            }
        } else if (countB > countA) {
            int count = countB - countA;
            while (count != 0) {
                p2 = p2.next;
                count--;
            }
        }

        while (p1 != null && p2 != null) {
            if (p1 == p2) {
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return null;

    }
}
