package workSpace.src.array;

import java.util.Arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];

        int i = 0;
        while (i < len) {
            ans[i] = nums[i++];
        }
        while (i < (2 * len)) {
            ans[i] = nums[i++ - len];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] ans = new ConcatenationOfArray().getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
