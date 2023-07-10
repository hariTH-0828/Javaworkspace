package workSpace;

public class HouseRobber {

	// Video Link :
	// https://www.youtube.com/watch?v=73r3KWiEvyk&list=PLot-Xpze53lfQmTEztbgdp8ALEoydvnRQ&index=5
	int robberAmount(int[] nums) {
		int temp;
		int rob1 = 0;
		int rob2 = 0;
		for (int i = 0; i < nums.length; i++) {
			temp = Math.max(nums[i] + rob1, rob2);
			rob1 = rob2;
			rob2 = temp;
		}
		return rob2;
	}

	public static void main(String args[]) {
		HouseRobber robber = new HouseRobber();
		int[] nums = { 1, 2, 3, 1 };
		int result = robber.robberAmount(nums);
		System.out.println(result);
	}
}
