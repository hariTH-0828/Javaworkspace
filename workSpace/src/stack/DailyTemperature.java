package workSpace.src.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DailyTemperature {

    public int[] dailyTemperature(int[] temperatures){
        Stack<List<Integer>> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > stack.peek().get(1)){
                int index = stack.peek().get(0);
                answer[index] = (i - index);
                stack.pop();
            }
            stack.add(new ArrayList<>(Arrays.asList(i, temperatures[i])));
        }

        while(!stack.isEmpty()){
            int index = stack.peek().get(0);
            answer[index] = 0;
            stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temperature = {
                73,74,75,71,69,72,76,73
        };

        DailyTemperature objectTemp = new DailyTemperature();
        objectTemp.dailyTemperature(temperature);
    }
}
