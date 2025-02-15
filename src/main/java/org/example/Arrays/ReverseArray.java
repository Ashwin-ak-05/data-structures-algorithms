package org.example.Arrays;

public class ReverseArray {
    public static char[] reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l<r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        return s;

    }
}
