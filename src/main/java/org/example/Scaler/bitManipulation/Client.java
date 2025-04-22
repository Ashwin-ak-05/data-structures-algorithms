package org.example.Scaler.bitManipulation;

public class Client {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = -2147483412;
              //-2147483648
        System.out.println(reverseInteger.reverse(x));
    }
}
