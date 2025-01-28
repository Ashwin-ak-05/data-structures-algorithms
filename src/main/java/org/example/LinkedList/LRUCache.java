package org.example.LinkedList;


import java.util.HashMap;

public class LRUCache {

    class Node{
        int data;
        int key;
        Node next;
        Node prev;

        Node(int x,int k){
            this.data = x;
            this.key = k;
        }
    }

    Node head = new Node(-1,-1);
    Node tail = new Node(-1,-1);

    HashMap<Integer, Node> nodeHashMap = new HashMap<Integer, Node>();
    int cacheCapacity = 0;


    public LRUCache(int capacity) {
        this.cacheCapacity = capacity;
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        if(nodeHashMap.containsKey(key)){
           removeNode(nodeHashMap.get(key));
           insertNode(nodeHashMap.get(key));
           return nodeHashMap.get(key).data;
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value) {

        if(nodeHashMap.containsKey(key)){
            removeNode(nodeHashMap.get(key));
            Node newNode = new Node(value,key);
            nodeHashMap.put(key,newNode);
            insertNode(nodeHashMap.get(key));
        }
        else{
            if(nodeHashMap.size() < cacheCapacity){
                Node newNode = new Node(value,key);
                nodeHashMap.put(key,newNode);
                insertNode(nodeHashMap.get(key));
            }
            else{
                Node head_next = head.next;
                nodeHashMap.remove(head_next.key);
                removeNode(head_next);

                Node newNode = new Node(value,key);
                nodeHashMap.put(key,newNode);
                insertNode(nodeHashMap.get(key));
            }
        }



//        if(nodeHashMap.size() <= cacheCapacity){
//            if(nodeHashMap.containsKey(key)){
//                removeNode(nodeHashMap.get(key));
//                insertNode(nodeHashMap.get(key));
//            }
//            else{
//                Node newNode = new Node(value,key);
//                nodeHashMap.put(key,newNode);
//                insertNode(nodeHashMap.get(key));
//            }
//        }
//        else{
//            Node head_next = head.next;
//            nodeHashMap.remove(key,nodeHashMap.get(key));
//            removeNode(head_next);
//
//            Node newNode = new Node(value,key);
//            nodeHashMap.put(key,newNode);
//            insertNode(nodeHashMap.get(key));
//        }
    }

    public void insertNode(Node node){
        Node temp = tail.prev;
        temp.next = node;
        tail.prev = node;
        node.next = tail;
        node.prev = temp;

    }

    public void removeNode(Node node){
        Node temp_prev = node.prev;
        Node temp_next = node.next;

        temp_prev.next = temp_next;
        temp_next.prev = temp_prev;

        node.next = null;
        node.prev = null;
    }

}


