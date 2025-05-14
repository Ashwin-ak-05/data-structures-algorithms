package org.example.LinkedList;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prev_node = null;

        while (temp != null) {
            ListNode kth = findKthNode(temp, k - 1);
            if (kth == null) {
                return head;
            }
            ListNode next_node = kth.next;
            kth.next = null;
            ListNode reverse = reverseNode(temp);
            if (temp == head) {
                head = kth;
            } else {
                prev_node.next = reverse;
            }

            prev_node = temp;

            temp.next = next_node;
            temp = temp.next;
        }

        return head;

    }

    public ListNode reverseNode(ListNode root) {
        ListNode rh = null;

        while (root != null) {
            ListNode temp = root.next;
            root.next = rh;
            rh = root;
            root = temp;
        }
        return rh;
    }

    public ListNode findKthNode(ListNode root, int k) {
        ListNode temp = root;

        for (int i = 0; i < k; i++) {
            temp = temp.next;
            if (temp == null) {
                return null;
            }
        }

        return temp;
    }
}
