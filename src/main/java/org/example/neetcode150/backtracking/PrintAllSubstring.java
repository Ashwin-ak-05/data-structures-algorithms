package org.example.neetcode150.backtracking;

public class PrintAllSubstring {
    int count = 0;

    void print(String string, int index) {
        if(index>=string.length()){
            return;
        }

        for (int end = index; end < string.length(); end++) {
            count++;
            System.out.println(count + " " + string.substring(index,end+1));

        }
        print(string,index+1);


    }
}
