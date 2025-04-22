package org.example.Scaler.Greedy;

public class Client {
    public static void main(String[] args) {
        BinaryStrings binaryStrings = new BinaryStrings();
        String A = "00010110";
        int B = 3;

        System.out.println(binaryStrings.solve(A,B));
    }
}
