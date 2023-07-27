package workSpace.src.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens){
        Stack<Integer> stack = new Stack<>();

        for(String number : tokens){
            if(number.equals("+")){
                stack.add(
                        stack.pop() + stack.pop()
                );
            }else if(number == "-"){
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a - b);
            }else if(number == "/") {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a / b);
            }else if(number == "*"){
                stack.add(
                    stack.pop() * stack.pop()
                );
            }else {
                stack.add(Integer.parseInt(number));
            }
        }

        return stack.peek();
    }
    public static void main(String[] args) {
        String[] tokens = {
                "2","1","+","3","*"
        };

        System.out.println(new EvaluateReversePolishNotation().evalRPN(tokens));
    }
}
