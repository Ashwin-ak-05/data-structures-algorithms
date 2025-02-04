package org.example.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        PathExistGraph pathExistGraph = new PathExistGraph();
//        int[][] edge = {{0,1},{0,2},{3,5},{5,4},{4,3}};
//        pathExistGraph.validPath(6,edge,0,5);

//        RottenOranges rottenOranges = new RottenOranges();
//        int[][] grid = {{2,1,1,},{1,1,0},{0,1,1}};
//        //int[][] grid = {{0,1}};
//        System.out.print(rottenOranges.orangesRotting(grid));

//        DFSConnected dfsConnected = new DFSConnected();
//        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
//
//        ArrayList<Integer> arr1 = new ArrayList<>(){{
//            add(2);
//            add(3);
//            add(1);
//        }};
//
//        ArrayList<Integer> arr2 = new ArrayList<>(){{
//            add(0);
//
//        }};
//
//        ArrayList<Integer> arr3 = new ArrayList<>(){{
//            add(0);
//            add(4);
//        }};
//
//        ArrayList<Integer> arr4 = new ArrayList<>(){{
//            add(0);
//
//        }};
//
//        ArrayList<Integer> arr5 = new ArrayList<>(){{
//            add(2);
//
//        }};
//
//
//
//        adj.add(arr1);
//        adj.add(arr2);
//        adj.add(arr3);
//        adj.add(arr4);
//        adj.add(arr5);
//
//        dfsConnected.dfsOfGraph(adj);

//        CompleteComponent completeComponent = new CompleteComponent();
//        int[][] edges = {{0,1},{0,2},{1,2},{3,4},{3,5}};
//        System.out.println(completeComponent.countCompleteComponents(6,edges));

        TopoligicalSort topoligicalSort = new TopoligicalSort();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();


        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);


        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.add(3);


        ArrayList<Integer> arr4 = new ArrayList<>();
        //arr4.add(0);
        ArrayList<Integer> arr5 = new ArrayList<>();
        arr5.add(0);
        arr5.add(1);

        ArrayList<Integer> arr6 = new ArrayList<>();
        arr6.add(0);
        arr6.add(2);


        adj.add(arr1);
        adj.add(arr2);
        adj.add(arr3);
        adj.add(arr4);
        adj.add(arr5);
        adj.add(arr6);
        //adj.add(a)

        ArrayList<Integer> arrayList = topoligicalSort.returnOrder(adj);
        for (Integer i : arrayList) {
            System.out.print(i + " ");
        }


    }
}
