package org.example.Scaler.Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Imagine you're a teacher. You ask students to call out a letter one by one. After each letter, you jot down the very first letter that's only been called out once. If all letters have been repeated, you write "#".

 * Here's a scenario:

 * A student says "a". It's the first letter. You write "a".
 * Next, a student says "b", "a" is still unique, so you add "a". Now it's "aa".
 * A student says "a" again. Now, "b" is the unique one. You add "b", making it "aab".
 * A student says "b". All letters so far are repeated. You add "#". It becomes "aab#".
 * A student says "c". "c" is unique. You add "c". The final is "aab#c".
 * Your task? Given the sequence the students call out A, determine the string on the board.
 */

public class UniqueLetters {
    public String solve(String A) {
        int n = A.length();
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        q.add(A.charAt(0));
        String ans = "" + A.charAt(0);
        hm.put(A.charAt(0), 1);

        for (int i = 1; i < n; i++) {
            char ch = A.charAt(i);

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }

            if (hm.get(ch) == 1) {
                q.add(ch);
            }

            while (!q.isEmpty() && hm.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                ans = ans + "#";
            } else {
                ans = ans + q.peek();
            }

        }
        return ans;


    }
}
