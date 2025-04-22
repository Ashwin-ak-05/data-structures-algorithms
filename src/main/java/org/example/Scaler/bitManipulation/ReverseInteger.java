package org.example.Scaler.bitManipulation;

public class ReverseInteger {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if (x > Integer.MAX_VALUE / 10 || x < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int r = x % 10;
            ans = (ans * 10) + r;
            x = x / 10;
        }
        return ans;
    }
}
