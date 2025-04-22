package org.example.Scaler.Stacks;

import java.util.Stack;

public class CheckTwoBracketExpression {
//'-(-(-(-a+b)-d+c)-q)'

        public char[] find(String A){
            int n = A.length();
            Stack<Character> st = new Stack<>();
            char[] arr = new char[26];
            st.push('+');
            char current = '+';

            for(int i=0; i<n; i++){
                char ch = A.charAt(i);
                if(ch>='a' && ch<='z'){
                    arr[ch-'a'] = current;
                }
                else if(ch=='('){
                    st.push(current);
                }
                else if(ch==')'){
                    current = st.pop();
                }
                else{
                    current = ch==st.peek()?'+':'-';
                }
                System.out.print(ch+" "+current+"  ");

            }
            return arr;
        }
        public int solve(String A, String B) {
            char[] arr1 = find(A);
            char[] arr2 = find(B);
            for(int i=0; i<26; i++){
                if(arr1[i]!=arr2[i])
                    return 0;
            }
            return 1;

        }

}
