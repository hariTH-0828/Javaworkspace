package workSpace.src.workSpace;

import java.util.HashMap;
import java.util.Stack;

public class BalancedParentheses {

    private static boolean validParentheses(String parentheses) {
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();

        map.put(')','(');
        map.put('}', '{');
        map.put('[', ']');

        for (char i : parentheses.toCharArray()) {
            if(map.containsKey(i)) {
                if(!stack.isEmpty() && stack.peek() == map.get(i)) {
                    stack.pop();
                }else {
                    return false;
                }
            }else stack.add(i);
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String parentheses = "()";
        System.out.println(validParentheses(parentheses));
    }

}
