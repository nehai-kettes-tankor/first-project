package calculator;

import java.util.ArrayList;

public class ComputeRules {
    static ArrayList<String> first_precedence(ArrayList<String> input){
        while (input.contains("*") || input.contains("/")){
            if(((input.contains("/") && input.contains("*")) && input.indexOf("*") < input.indexOf("/")) || !input.contains("/")){
                int i = input.indexOf("*");
                double prod = Double.parseDouble(input.get(i - 1)) * Double.parseDouble(input.get(i + 1));
                input.set(i, String.valueOf(prod));
                input.remove(i + 1);
                input.remove(i - 1);
            }else{
                int i = input.indexOf("/");
                double slash = Double.parseDouble(input.get(i - 1)) / Double.parseDouble(input.get(i + 1));
                input.set(i, String.valueOf(slash));
                input.remove(i + 1);
                input.remove(i - 1);
            }
        }
        return input;
    }

    static ArrayList<String> second_precedence(ArrayList<String> input){
        while (input.contains("+") || input.contains("-")){
            if(((input.contains("-") && input.contains("+")) && input.indexOf("+") < input.indexOf("-")) || !input.contains("-")){
                int i = input.indexOf("+");
                double sum = Double.parseDouble(input.get(i - 1)) + Double.parseDouble(input.get(i + 1));
                input.set(i, String.valueOf(sum));
                input.remove(i + 1);
                input.remove(i - 1);
            }else{
                System.out.println(input.indexOf("+"));
                int i = input.indexOf("-");
                double dif = Double.parseDouble(input.get(i - 1)) - Double.parseDouble(input.get(i + 1));
                input.set(i, String.valueOf(dif));
                input.remove(i + 1);
                input.remove(i - 1);
            }
        }
        return input;
    }
}
