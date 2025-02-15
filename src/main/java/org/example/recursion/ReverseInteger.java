package org.example.recursion;

public class ReverseInteger {
    int count = 0;

    public int reverse(int x) {


        int num = x / 10;
        int remainder = x % 10;

        if (num <= 0) {
            return x;
        }
        return (remainder * 10) + (reverse(num));


    }


}
