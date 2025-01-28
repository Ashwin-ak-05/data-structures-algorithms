package org.example.Tries;

import java.util.HashMap;

public class Trie {
    char val;
    HashMap<Character,Trie> child;
    boolean isWordEnd;
    Trie(char val){
        this.val = val;
        this.child = new HashMap<>();
        this.isWordEnd = false;

    }
}
