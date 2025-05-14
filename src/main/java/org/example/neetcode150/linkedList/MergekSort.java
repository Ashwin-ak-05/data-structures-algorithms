package org.example.neetcode150.linkedList;

public class MergekSort {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        int l = 0;
        int r = lists.length - 1;
        return sort(lists, l, r);
    }

    public ListNode sort(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        int mid = (l + r) / 2;
        ListNode l1 = sort(lists, l, mid);
        ListNode l2 = sort(lists, mid + 1, r);
        return mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode newNode = new ListNode(-1);
        ListNode current = newNode;

        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                current.next = h1;
                h1 = h1.next;
            } else {
                current.next = h2;
                h2 = h2.next;
            }
            current = current.next;
        }

        if (h1 != null) {
            current.next = h1;
        }
        if (h2 != null) {
            current.next = h2;
        }

        return newNode.next;
    }
}
