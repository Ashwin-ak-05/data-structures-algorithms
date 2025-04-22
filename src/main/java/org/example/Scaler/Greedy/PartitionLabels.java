package org.example.Scaler.Greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = i;
            int end = s.lastIndexOf(s.charAt(start));

            for (int st = i + 1; st <= end - 1; st++) {
                if (s.lastIndexOf(s.charAt(st)) > end) {
                    end = s.lastIndexOf(s.charAt(st));
                }
            }

            list.add(end - start + 1);
            i = end;
        }

        return list;
    }
}
