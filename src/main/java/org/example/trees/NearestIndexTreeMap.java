package org.example.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NearestIndexTreeMap {

    public List<Integer> findNearestValue(int[][] queries){
        TreeSet<Integer> treeSet = new TreeSet<>();
        List<Integer> list = new ArrayList<>();
        int[] A = new int[10];
        for(int i = 0; i<queries.length; i++){
            int type = queries[i][0];
            int index =  queries[i][1];

            if(type == 1){
                A[index] = 1 - A[index];
                if(treeSet.contains(index)){
                    treeSet.remove(index);
                }
                else {
                    treeSet.add(index);
                }
            }
            else{
                if(treeSet.contains(index)){
                    list.add(index);
                }
                else{
                    int l = Integer.MAX_VALUE;
                    int r = Integer.MAX_VALUE;

                    if(treeSet.floor(index) != null){
                        l = index - treeSet.floor(index);
                    }
                    if(treeSet.ceiling(index) != null){
                        r = treeSet.ceiling(index) - index;
                    }
                    if(l == Integer.MAX_VALUE && r == Integer.MAX_VALUE){
                        list.add(-1);
                    }
                    if(l<=r){
                        list.add(treeSet.floor(index));

                    }
                    else {
                        list.add(treeSet.ceiling(index));
                    }
                }
            }
        }
        return list;
    }
}
