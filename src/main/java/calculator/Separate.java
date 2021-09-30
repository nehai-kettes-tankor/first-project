package calculator;

import java.util.ArrayList;

public class Separate {
    static ArrayList<String> separate(String input) {
        ArrayList<Character> separators = new ArrayList<>();
        separators.add('+') ;
        separators.add('-');
        separators.add('*');
        separators.add('/');

        ArrayList<String> pieces = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (!separators.contains(input.charAt(i))) {
                sb.append(input.charAt(i));
            } else {
                pieces.add(sb.toString());
                pieces.add(String.valueOf(input.charAt(i)));
                sb.delete(0, sb.length());
            }
        }
        if(!sb.isEmpty()){
            pieces.add(sb.toString());
        }

        return pieces;
    }
}
