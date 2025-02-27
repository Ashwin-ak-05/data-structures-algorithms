package org.example.neetcode150.linkedList;

public class Client {
    public static void main(String[] args) {

//        int[] arr = {1,2};
//        ListNode head = CreateNode.arrayToListNode(arr);
//        RemoveNode removeNode = new RemoveNode();
//        ListNode ansHead = removeNode.removeNthFromEnd(head,2);
//        PrintNode.printList(ansHead);
        MergeSortedList mergeSortedList = new MergeSortedList();

        int[] h1 = {1,3,5};
        int[] h2 = {2,4,6};
        int[] h3 = {2,3,5,6,7,8};

        ListNode[] listNodes = {CreateNode.arrayToListNode(h1),CreateNode.arrayToListNode(h2),CreateNode.arrayToListNode(h3)};

        MergekSort mergekSort = new MergekSort();
        mergekSort.mergeKLists(listNodes);
    }
}
