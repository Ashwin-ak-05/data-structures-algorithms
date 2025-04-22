package org.example.carry_forward;

public class Client {
    public static void main(String[] args) {
//        char[] arr = {'a', 'g', 'a', 'g', 'g', 'a', 'd'};
//        FindAGPairs findAGPairs = new FindAGPairs();
//        System.out.println(findAGPairs.countPair(arr));

        ClosestMinMax closestMinMax = new ClosestMinMax();
        int[] arr = {814,761,697,483,981};
        System.out.println(closestMinMax.findClosestMinMax(arr));
    }
}
