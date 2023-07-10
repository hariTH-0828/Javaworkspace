package workSpace;

public class MaximumSubArray {

	int maxSubArray(int[] nums) {
		int currentSum = 0, maximumSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum += nums[i];
			maximumSum = Math.max(maximumSum, currentSum);
		}
		return maximumSum;
	}
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		MaximumSubArray maximumSubArray = new MaximumSubArray();
		int result = maximumSubArray.maxSubArray(nums);
		System.out.println(result);
	}

}
