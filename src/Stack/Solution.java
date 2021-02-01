package Stack;

import java.util.Stack;

public class Solution {




    public boolean isValid(String s) {


        String opening = "({[";
        String closing = ")}]";

        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()){
            if(opening.indexOf(c)!=-1){
                stack.push(c);
            }
            else if(closing.indexOf(c)!=-1){
                if(stack.isEmpty()){
                    return false;
                }
                if(closing.indexOf(c)!=opening.indexOf(stack.pop())){
                    return false;
                }

            }
        }

        return stack.isEmpty();












    }
}
