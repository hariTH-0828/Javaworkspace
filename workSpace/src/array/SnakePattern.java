package workSpace.src.array;

import java.util.ArrayList;
import java.util.Arrays;

public class SnakePattern {

    private ArrayList<Integer> formatPattern(int[][] nums) {
        ArrayList<Integer> patternContainer = new ArrayList<>();
        int left = 0; int right = nums[0].length;
        int top = 0; int down = nums.length;

        while (top != down) {
            if(top % 2 == 0) {
                // Iterate element from left to right
                for (int i = left; i < right; i++) {
                    patternContainer.add(nums[top][i]);
                }
            }else {
                // Iterate element from right to left
                for (int i = right - 1; i >= 0; i--) {
                    patternContainer.add(nums[top][i]);
                }
            }
            top++;
        }
        return patternContainer;
    }
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> formedPattern = new SnakePattern().formatPattern(nums);
        System.out.println(formedPattern);
    }
}
