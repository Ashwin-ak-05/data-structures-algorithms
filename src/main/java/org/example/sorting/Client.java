package org.example.sorting;

import org.example.sorting.models.Response;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        InversionCount inversionCount = new InversionCount();
        int[] arr1 = {-3,4,3,2};
        int[] arr2 = {2, 1, 6, 10, 4, 1, 3, 9, 7};
//        Response response = inversionCount.inversionCount(arr1);
//        System.out.println(response.count);
//        int[] result = response.arr;
//        for (int i : result) {
//            System.out.print(i + " ");
//        }
        //System.out.println(inversionCount.inversionCount(arr1));
//        PivotArray pivotArray = new PivotArray();
//        int[] result = pivotArray.pivotArray(arr1,2);

        QuickSort quickSort = new QuickSort();
        int[] result = quickSort.sort(arr2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
