package array;

import java.util.Arrays;

public class TwoSumII {

	// Video Link :
	// https://www.youtube.com/watch?v=cQ1Oz4ckceM&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=4

	int[] twoSum(int[] nums, int target) {
		int j = nums.length - 1;
		int[] result = new int[2];

		for (int i = 0; i < nums.length;) {
			int sum = nums[i] + nums[j];
			if (sum == target) {
				result[0] = i + 1;
				result[1] = j + 1;
				return result;
			} else if (sum > target) {
				j--;
			} else
				i++;
		}
		return result;
	}

	public static void main(String args[]) {
		int[] nums = { 1, 3, 4, 5, 7, 10, 11 };
		int target = 9;

		TwoSumII twoSumII = new TwoSumII();
		int[] result = twoSumII.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
