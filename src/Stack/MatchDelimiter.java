package Stack;

import java.util.stream.Stream;

public class MatchDelimiter {

    public static boolean isMatched(String expression){
        final String opening = "({[";
        final String closing = ")}]";
//{}[()]
        StackOnList<Character> buffer = new StackOnList<>();
        for(char c : expression.toCharArray()){
            if(opening.indexOf(c)!=-1){
                buffer.push(c);
            }
            else if(closing.indexOf(c)!=-1){
                if(buffer.isEmpty())
                    return false;
                if(closing.indexOf(c)!=opening.indexOf(buffer.pop())){
                    return false;
                }
            }
        }

return buffer.isEmpty();
    }


    public static void main(String[] args) {
        String expression = "{}[()]";
     System.out.println( MatchDelimiter.isMatched(expression));
    }
}
