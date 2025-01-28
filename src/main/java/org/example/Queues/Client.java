package org.example.Queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
//        ReverseKElement reverseKElement = new ReverseKElement();
//        Queue<Integer> queue = new LinkedList<>(List.of(1,2,3,4,5));
//        Queue<Integer> ans = reverseKElement.modifyQueue(queue,3);
//        while(!ans.isEmpty()){
//            System.out.print(ans.poll() + " ");
//        }
//
//        GenerateKNumber generateKNumber = new GenerateKNumber();
//        System.out.println(generateKNumber.GeneerateKthElement(5));

        FirstRepeatingCharacter firstRepeatingCharacter = new FirstRepeatingCharacter();

//        char[] charArr = {'a','b','c','c','a','e','b','e','a','g'};
//
//        char[] output = firstRepeatingCharacter.findRepeating(charArr);
//
//        for(char x : output){
//            System.out.print(x + " ");
//        }

        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        String string = "aabb";
        System.out.println(firstUniqueCharacter.firstUniqChar(string));
    }
}
