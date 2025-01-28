package org.example.Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Character,Integer> hashmap = new HashMap<>();

        int index = -1;

        for(int i = 0; i<s.length(); i++){
            queue.add(i);
            if(hashmap.containsKey(s.charAt(i))){
                Integer freq = hashmap.get(s.charAt(i));
                hashmap.put(s.charAt(i),freq+1);
            }
            else {
                hashmap.put(s.charAt(i),1);
            }

            char getChar;
//            if(!queue.isEmpty()){
//                 getChar = s.charAt(queue.peek());
//            }

            while(!queue.isEmpty() && hashmap.get(s.charAt(queue.peek())) > 1){
                queue.poll();
            }

            if(!queue.isEmpty()){
                index = queue.peek();
            }
            else {
                index = -1;
            }


        }

//        if(queue.isEmpty()){
//            return -1;
//        }
        return index;

    }
}
