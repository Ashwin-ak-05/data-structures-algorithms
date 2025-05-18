package org.example.LinkedList;

/***
 * Given a linked list, return an integer denoting the length of the longest palindrome list that exists in the given linked list.
 */

public class MaxLengthPalindrome {
    public static int maxPalindrome(Node head) {
        int max_len = 0;
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            // Reverse current node's pointer
            curr.next = prev;

            // Check for odd length palindrome (center at curr)
            max_len = Math.max(max_len, 2 * countCommon(prev, next) + 1);

            // Check for even length palindrome (center between prev and curr)
            max_len = Math.max(max_len, 2 * countCommon(curr, next));

            // Move prev and curr forward
            prev = curr;
            curr = next;
        }

        return max_len;
    }

    // Counts matching nodes starting from n1 and n2
    private static int countCommon(Node n1, Node n2) {
        int count = 0;
        while (n1 != null && n2 != null) {
            if (n1.data == n2.data) {
                count++;
                n1 = n1.next;
                n2 = n2.next;
            } else {
                break;
            }
        }
        return count;
    }
}
