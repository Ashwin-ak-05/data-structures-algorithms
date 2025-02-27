package org.example.neetcode150.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodingDecoding {
    public String encode(String s[]) {
        String res = "";
        for(int i = 0; i<s.length; i++){
            res = res + s[i].length()+"#"+s[i];
        }
        return res;
    }

    public String[] decode(String s) {
        List<String> list = new ArrayList<>();
        String res = "";
        for(int i=0;i<s.length();i++){
            String inte = "";
            while (s.charAt(i) != '#'){
                inte=inte+s.charAt(i);
                i++;
            }
            if(s.charAt(i)=='#' && Character.isDigit(s.charAt(i-1))){
                int len = Integer.parseInt(inte)+i;
                //int len = Character.getNumericValue(num)+i;
                i=i+1;

                while (i<=len){
                    res = res + s.charAt(i);
                    i++;
                }
                i=i-1;
                list.add(res);
                res = "";
            }
            else {
                continue;
            }
        }

        String[] strings = new String[list.size()];
        for(int i = 0; i<list.size();i++){
            strings[i] = list.get(i);
        }
        return strings;
    }
}
