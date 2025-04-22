package org.example.neetcode150.stacks;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> list;
    int n;

    public List<String> generateParenthesis(int k) {
        list = new ArrayList<>();
        n = k;
        generate("(",1,0);
        return list;

    }

    public void generate(String string, int open, int close){

        if(open == n && close == n){
            list.add(string);
            return;
        }

        if(open>close){
            generate(string+")",open,close+1);
        }
        if(open<=n){
            generate(string+"(",open+1,close);
        }
    }
}
