package org.example.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElementWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        count.add(hm.size());

        int s = 1;
        int e = k;

        while (e < arr.length) {
            hm.put(arr[s - 1], hm.get(arr[s - 1]) - 1);
            if (hm.get(arr[s - 1]) == 0) {
                hm.remove(arr[s - 1]);
            }

            if (hm.containsKey(arr[e])) {
                hm.put(arr[e], hm.get(arr[e]) + 1);
            } else {
                hm.put(arr[e], 1);
            }

            count.add(hm.size());
            s++;
            e++;
        }

        return count;
    }
}
