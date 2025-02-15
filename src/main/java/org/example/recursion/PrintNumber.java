package org.example.recursion;

public class PrintNumber {

    static void print(int N){
        if(N == 0){
            return;
        }

        print(N - 1);
        System.out.println(N);
    }
}
