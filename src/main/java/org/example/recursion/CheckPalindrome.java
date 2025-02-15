package org.example.recursion;

public class CheckPalindrome {
    boolean isPalindrome(String str, int l, int r) {

        if (l >= r) {
            return true;
        }
        if (!Character.isLetterOrDigit(str.charAt(l))) {
            return isPalindrome(str, l + 1, r);
        }

        // Skip non-alphanumeric characters on the right
        if (!Character.isLetterOrDigit(str.charAt(r))) {
            return isPalindrome(str, l, r - 1);
        }

        //char l =  str.toLowerCase().charAt(l);

        if (str.toLowerCase().charAt(l) == str.toLowerCase().charAt(r) && isPalindrome(str, l + 1, r - 1)) {
            return true;
        }
        return false;
    }
}
