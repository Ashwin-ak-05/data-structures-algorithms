package org.example.neetcode150.binarySearch;

import org.example.Tries.SearchTheWord;

public class Client {
    public static void main(String[] args) {
//        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
//        int[] piles = {805306368,805306368,805306368};
//        System.out.print(kokoEatingBananas.minEatingSpeed(piles,1000000000));
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo","bar",1);
        System.out.println(timeMap.get("foo",1));
        timeMap.set("foo","bar 2",3);
        System.out.println(timeMap.get("foo",2));
    }
}
