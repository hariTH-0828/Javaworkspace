package workSpace.src.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s){

        // Mapping opening and closing parenthesis
        HashMap<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put(')', '(');
        parenthesis.put(']', '[');
        parenthesis.put('}', '{');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(parenthesis.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == parenthesis.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }else stack.add(c);
        }

        if(stack.isEmpty()){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        String s = "[";
        System.out.println(new ValidParenthesis().isValid(s));
    }
}
