package org.example.searching;

public class Client {
    public static void main(String[] args) {
//        BinarySearch binarySearch = new BinarySearch();
//        int[] arr = {2,5,5,5,6,7,8,9};
//        System.out.println(binarySearch.search(arr,9));
//
//        FirstAndLastOccurance firstAndLastOccurance = new FirstAndLastOccurance();
//        System.out.println(firstAndLastOccurance.lastOccurance(arr,5));

//        PeakElement peakElement = new PeakElement();
//        int[] arr = {3,3,7,7,10,11,11};
//        System.out.println(peakElement.findPeakElement(arr));

//        FindSquareRoot findSquareRoot = new FindSquareRoot();
//        System.out.println(findSquareRoot.mySqrt(2147483647));

//        WorkPartition workPartition = new WorkPartition();
//        int[] arr = {1,2,3,4,100};
//        System.out.println(workPartition.minDays(arr,3));

//        AggressiveCow aggressiveCow = new AggressiveCow();
//        int[] arr = {1,2,3,4,7};
//        System.out.println(aggressiveCow.aggressiveCows(arr,3));

        MinimumInRotatedArray minimumInRotatedArray = new MinimumInRotatedArray();
        int[] arr = {3,4,5,1,2};
        System.out.println(minimumInRotatedArray.findMin(arr));
    }
}
