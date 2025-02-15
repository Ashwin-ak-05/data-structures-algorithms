package org.example.recursion;

public class AddDigits {
    public int addDigits(int num) {
        if (String.valueOf(num).length() == 1) {
            return num;
        }

        int value = addDigits(num / 10) + num % 10;

        if (String.valueOf(num).length() > 1) {
            return addDigits(value);
        } else {
            return value;
        }

    }
}
