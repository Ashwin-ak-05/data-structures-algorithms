package org.example.Scaler.Stacks;

public class TwoBracketExpression {
    public int solve(String A, String B) {
        String stringOne = evaluate(A);
        String stringTwo = evaluate(B);
        System.out.println(stringOne);
        System.out.println(stringTwo);


        if(stringOne.equals(stringTwo)){
            return 1;
        }
        return 0;
    }



    String  evaluate(String A){
        String ans = "";
        boolean negative = false;

        for(int i = 0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(i>0 && A.charAt(i) == '(' && A.charAt(i - 1) == '-'){

                negative = !negative;

            }
            else if(ch == ')'){
                negative = false;
            }
            else{
                if(ch == '-' || ch == '+'){
                    if(negative){
                        if(ch == '-'){
                            ans = ans + '+';
                        }
                        else{
                            ans = ans + '-';
                        }
                    }
                    else{
                        ans = ans + ch;
                    }
                }
                else{
                    if(ch != '('){
                        ans = ans + ch;
                    }

                }
            }


        }

        return ans;
    }
}
