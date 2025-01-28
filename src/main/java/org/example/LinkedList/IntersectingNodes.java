package org.example.LinkedList;

public class IntersectingNodes {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        if(headA == null || headB == null){
            return null;
        }

        //ListNode resultNode = null;
        ListNode headA_last =  headA;




        while(headA_last.next != null){
            headA_last = headA_last.next;
        }


        headA_last.next = headB;



        ListNode s = headA;
        ListNode f = headA;

        while (f.next != null && f.next.next != null){


                s = s.next;
                f = f.next.next;

                if(s == f){
                    break;
                }


        }

        if(f.next==null){
            return  null;
        }

//        printLinkedList(headA);
//        printLinkedList(f);


        ListNode p1 = headA;
        ListNode p2 = s;

        while (p1 != p2){

            p1 = p1.next;
            p2 = p2.next;

            if(p1 == p2){
                return p1;
            }
        }

        return null;


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
