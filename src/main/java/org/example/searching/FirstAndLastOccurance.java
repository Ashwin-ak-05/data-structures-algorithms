package org.example.searching;

public class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int first = firstOccurance(nums, target);
        int last = lastOccurance(nums, target);
        result[0] = first;
        result[1] = last;
        return result;


    }

    public int firstOccurance(int[] arr, int target) {
        int first = -1;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return first;
    }

    public int lastOccurance(int[] arr, int target) {
        int last = -1;
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return last;
    }
}
