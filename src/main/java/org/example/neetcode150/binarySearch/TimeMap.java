package org.example.neetcode150.binarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeMap {

    class Pair {
        String data;
        int timeStamp;

        Pair(String data, int timeStamp) {
            this.data = data;
            this.timeStamp = timeStamp;
        }

        String getData() {
            return this.data;
        }

        int getTimeStamp() {
            return this.timeStamp;
        }


    }


    HashMap<String, List<Pair>> hashMap;


    public TimeMap() {
        hashMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        Pair pair = new Pair(value, timestamp);
        if (!hashMap.containsKey(key)) {
            List<Pair> list = new ArrayList<>();
            list.add(pair);
            hashMap.put(key, list);
        } else {
            hashMap.get(key).add(pair);
        }
    }

    public String get(String key, int timestamp) {
        if (!hashMap.containsKey(key)) return "";
        List<Pair> pairs = hashMap.get(key);

        int l = 0;
        int r = pairs.size() - 1;
        Pair pair = null;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (timestamp == pairs.get(mid).getTimeStamp()) {
                return pairs.get(mid).getData();
            } else if (timestamp >= pairs.get(mid).getTimeStamp()) {
                if (pair == null) {
                    pair = pairs.get(mid);
                } else {
                    if (pair.getTimeStamp() < pairs.get(mid).getTimeStamp()) {
                        pair = pairs.get(mid);
                    }
                }

                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }


        if (pair == null) {
            return "";
        }
        return pair.getData();
    }
}
