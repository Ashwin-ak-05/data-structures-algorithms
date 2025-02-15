package org.example.searching;

public class FindSquareRoot {
    public int mySqrt(int x) {
        if(x == 0 || x ==1){
            return x;
        }
        int l = 1;
        int r = x;

        int ans = 1;

        while (l<=r){
            int m = (l+r)/2;
            if ((long)m*m <= x){
                ans = m;
                l = m+1;
            }
            else{
                r =  m-1;
            }
        }
        return ans;
    }
}
