package workSpace.src.array;

import java.util.Arrays;
import java.util.Stack;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = Arrays.stream(nums).sum();

        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - nums[i] - leftSum;
            if(leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1,-1,-1,-1,0};
        int result = new PivotIndex().pivotIndex(nums);
        System.out.println(result);
    }
}
