package org.example.neetcode150.graphs;
import java.util.*;

public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < tickets.size(); i++) {
            String from = tickets.get(i).get(0);
            String dest = tickets.get(i).get(1);

            if (hm.containsKey(from)) {
                hm.get(from).add(dest);
            } else {
                hm.put(from, new ArrayList<>());
                hm.get(from).add(dest);
            }
        }

        for (List<String> list : hm.values()) {
            Collections.sort(list);
        }

        List<String> path = new ArrayList<>();
        dfs(hm, path, "JFK");
        return path;

    }

    public void dfs(HashMap<String, List<String>> hm, List<String> path, String from) {

        List<String> destinations = hm.get(from);

        while (destinations != null && !destinations.isEmpty()) {
            String next = destinations.get(0);
            destinations.removeFirst();
            dfs(hm, path, next);
        }
        path.addFirst(from);
    }
}
