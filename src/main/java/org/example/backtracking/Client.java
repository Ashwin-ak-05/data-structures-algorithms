package org.example.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        PrintOneAndTwo printOneAndTwo = new PrintOneAndTwo();
//        //printOneAndTwo.print(0,0,3);
//        printOneAndTwo.printArr(new int[3],0);

        PrintAllSubsets printAllSubsets = new PrintAllSubsets();
        int arr[] = {1,2};
        List<List<Integer>> result = printAllSubsets.subsets(arr);
        for (List<Integer> list : result) {
            for(int i : list){
                System.out.print(i);
            }
            System.out.print(" ");

        }
    }
}
