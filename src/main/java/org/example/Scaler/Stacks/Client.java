package org.example.Scaler.Stacks;

public class Client {
    public static void main(String[] args) {
        TwoBracketExpression twoBracketExpression = new TwoBracketExpression();
        String A = "-(-(-(-a+b)-d+c)-q)";
        String B = "a-b-d+c+q";
        System.out.println(twoBracketExpression.evaluate(A));
        System.out.println(twoBracketExpression.evaluate(B));
    }
}
