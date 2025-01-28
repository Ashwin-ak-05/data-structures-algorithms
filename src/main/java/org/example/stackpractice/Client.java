package org.example.stackpractice;

public class Client {
    public static void main(String[] args) {
        AreaOfHistogram areaOfHistogram = new AreaOfHistogram();
        int[] arr = {2,4,3,4,5,1};

        System.out.println(areaOfHistogram.largestRectangleArea(arr));
    }
}

