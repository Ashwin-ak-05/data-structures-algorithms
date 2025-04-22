package org.example.neetcode150.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    HashMap<Node, Node> hm = new HashMap<>();

    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        if (hm.containsKey(node)) {
            return hm.get(node);
        }

        Node clone = new Node(node.val);
        hm.put(node, clone);

        for (Node n : node.neighbors) {
            clone.neighbors.add(cloneGraph(n));
        }
        return clone;
    }
}
