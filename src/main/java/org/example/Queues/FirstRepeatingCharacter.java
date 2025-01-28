package org.example.Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstRepeatingCharacter {

    public char[] findRepeating(char[] arr){
        Queue<Character> queue = new LinkedList<>();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] output = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if(hashMap.containsKey(arr[i])){
                Integer val = hashMap.get(arr[i]);
                hashMap.put(arr[i],val+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
            while (queue.size() > 0 &&  hashMap.get(queue.peek()) > 1){
                queue.poll();
            }
            if(queue.isEmpty()){
                output[i] = ' ';
            }
            else {
                output[i] = queue.peek();
            }

        }

        return output;




    }
}
