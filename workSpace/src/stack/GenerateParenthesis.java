package workSpace.src.stack;

import java.util.*;

public class GenerateParenthesis {

    Stack<Character> stack = new Stack<>();
    List<String> result = new ArrayList<>();

    public List<String> backTrack(int openN, int closeN, int N){
        if(openN == N && closeN == N){
            String str = "";
            for(char i : stack){
                str += i;
            }
            result.add(str);
            return result;
        }

        if(openN < N){
            stack.add('(');
            backTrack(openN + 1, closeN, N);
            stack.pop();
        }

        if(closeN < openN){
            stack.add(')');
            backTrack(openN, closeN + 1, N);
            stack.pop();
        }

        return result;
    }

    public List<String> generateParenthesis(int n){
        return backTrack(0, 0, n);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(new GenerateParenthesis().generateParenthesis(n));
    }
}
