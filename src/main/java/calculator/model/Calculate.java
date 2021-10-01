package calculator.model;

import java.util.ArrayList;

public class Calculate {

    public static Double solve(String input) throws UnsupportedOperationException{
        ArrayList<String> pieces = Separate.separate(input);
        pieces = ComputeRules.first_precedence(pieces);
        pieces = ComputeRules.second_precedence(pieces);
        Double result = Double.valueOf(pieces.get(0));
        if(result.isInfinite()){
            throw new UnsupportedOperationException();
        }
        else{
            return result;
        }
    }

    public static void main(String[] args) {
        String inp = "14/2.56";
        System.out.println(solve(inp));
    }
}