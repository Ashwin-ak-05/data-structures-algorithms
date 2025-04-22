package org.example.Scaler.Greedy;

public class BinaryStrings {
    public int solve(String A, int B) {
        int n = A.length();
        int ones = 0;
        int zeros = 0;
        int count = 0;


        for (int i = 0; i < n; i++) {
            char bit = A.charAt(i);

            if (bit != '1') {
                count++;
                int no = i + B - 1;
                while ( i < no) ;
                {
                    char ch = A.charAt(i);
                    if (ch == '0') {
                        ones++;
                        zeros--;
                    } else {
                        zeros++;
                        ones--;
                    }
                    i++;
                }
            }

        }

        if (ones == B) {
            return count;
        }
        return -1;


    }
}
