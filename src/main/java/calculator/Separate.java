package calculator;

import java.util.ArrayList;

public class Separate {

    static ArrayList<String> separate(String input) throws UnsupportedOperationException {
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
                if(sb.isEmpty()){
                    if(input.charAt(i) == '-' && i + 1 < input.length() && !separators.contains(input.charAt(i+1))){
                        sb.append("-");
                    }else{
                        throw new UnsupportedOperationException();
                    }
                }else{
                    pieces.add(sb.toString());
                    pieces.add(String.valueOf(input.charAt(i)));
                    sb.delete(0, sb.length());
                }
            }
        }
        if(!sb.isEmpty()){
            pieces.add(sb.toString());
        }else{
            throw new UnsupportedOperationException();
        }

        return pieces;
    }
}
