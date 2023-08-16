package workSpace.src.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    // Optimal Solution
    public List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            List<Integer> generateColumn = new ArrayList<>();
            int coefficient = 1;
            generateColumn.add(coefficient);
            for(int column = 1; column < row; column++) {
                coefficient = coefficient * (row - column);
                coefficient = coefficient / column;
                generateColumn.add(coefficient);
            }
            triangle.add(generateColumn);
        }
        return triangle;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> one = new ArrayList<>(List.of(1));
        List<Integer> two = new ArrayList<>(Arrays.asList(1, 1));
        if(numRows == 1) {
            result.add(one);
            return result;
        }
        if(numRows == 2) {
            result.add(one); result.add(two);
            return result;
        }
        result.add(one); result.add(two);
        for(int i = 2; i < numRows; i++){
            int x = 0; int y = 1;
            List<Integer> getPrev = result.get(i - 1);
            List<Integer> temp = new ArrayList<>(List.of(1));
            while(x != getPrev.size() - 1) {
                temp.add(getPrev.get(x) + getPrev.get(y));
                x++; y++;
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
    public static void main(String[] args) {
        List<List<Integer>> result = new PascalTriangle().generateTriangle(5);
        System.out.println(result);
    }
}
