package array;

import java.util.Arrays;

public class ProductArrayExpectItself {

	private int[] productArray(int[] nums) {

		int[] result = new int[nums.length];

		int postfix = 1;
		for (int i = 0; i < nums.length; i++) {
			result[i] = postfix;
			postfix *= nums[i];
		}

		int prefix = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			result[i] *= prefix;
			prefix = prefix * nums[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(new ProductArrayExpectItself().productArray(nums)));
	}
}
