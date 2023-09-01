package workSpace.src.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	// Video link :
	// https://www.youtube.com/watch?v=KLlXCFG5TnA&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=2

	int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> position = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (!position.containsKey(diff)) {
				position.put(nums[i], i);
			} else {
				result[0] = position.get(diff);
				result[1] = i;
				return result;
			}
		}
		return result;
	}

	public static void main(String args[]) {
		int[] nums = { 2, 1, 5, 3, 4, 6 };
		int target = 6;

		TwoSum two_sum = new TwoSum();
		int[] result = two_sum.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
