package calculator;

import java.util.ArrayList;

public class Calculate {

    public static Double solve(String input){
        ArrayList<String> pieces = Separate.separate(input);
        pieces = ComputeRules.first_precedence(pieces);
        pieces = ComputeRules.second_precedence(pieces);
        return Double.valueOf(pieces.get(0));
    }

    public static void main(String[] args) {
        String inp = "2+3*5/6";
        System.out.println(solve(inp));
    }
}