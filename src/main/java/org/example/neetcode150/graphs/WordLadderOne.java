package org.example.neetcode150.graphs;

import java.util.Queue;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class WordLadderOne {
    class Pair {
        String word;
        int seq;

        Pair(String word, int seq) {
            this.word = word;
            this.seq = seq;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(beginWord.equals(endWord)){
            return 1;
        }
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < wordList.size(); i++) {
            set.add(wordList.get(i));
        }

        if (!set.contains(endWord)) {
            return 0;
        }

        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(beginWord,1));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            String word = pair.word;
            int seq = pair.seq;

            char[] chars = word.toCharArray();
            for(int i = 0; i<chars.length; i++){
                char originalChar = chars[i];
                for(char ch = 'a'; ch<='z'; ch++){
                    chars[i] = ch;
                    String new_word = new String(chars);
                    if(new_word.equals(endWord)){
                        return seq+1;
                    }
                    if(set.contains(new_word)){
                        q.add(new Pair(new_word,seq+1));
                        set.remove(new_word);
                    }
                }
                chars[i] = originalChar;
            }
        }
        return 0;

    }
}
