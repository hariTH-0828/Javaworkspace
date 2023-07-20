package linked_list;

public class FindDuplicateNumber {

	private int findDuplicates(int[] nums) {

		// Step 1: Find the intersection point of the cycle
		int tortoise = nums[0];
		int hare = nums[0];

		do {
			tortoise = nums[tortoise];
			hare = nums[nums[hare]];
		} while (tortoise != hare);

		// Step 2: Find the entrance to the cycle
		hare = nums[0];
		while (tortoise != hare) {
			tortoise = nums[tortoise];
			hare = nums[hare];
		}

		// The duplicate number is the entrance to the cycle
		return hare;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 2 };
		System.out.println(new FindDuplicateNumber().findDuplicates(nums));
	}

}
