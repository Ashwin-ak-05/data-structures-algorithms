package org.example.recursion;

public class PowerOfN {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            x = 1 / x;  // Convert negative exponent to positive
            if (n == Integer.MIN_VALUE) { // Handle edge case to avoid overflow
                n += 1;
                x *= x;
            }
            n = -n;
        }

        double ans = myPow(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        } else {
            return ans * ans * x;
        }
    }
}
