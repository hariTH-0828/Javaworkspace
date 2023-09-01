package workSpace.src.array;

import java.util.HashSet;

public class ContainDuplicate {

	public boolean duplicateCheck(int[] nums) {
		/*
		 * This method works only with [1, n] Given N number of values is less than the
		 * length of the range. Example : If the length of the array is 5, then which of
		 * the elements in the array is in between <5. N = 5, {1,3,4,2,1}
		 * 
		 */

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;

			if (nums[index] < 0) {
				return true;
			}

			nums[index] = -nums[index];
		}
		return false;
	}

	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> container = new HashSet<>();
        for(int i : nums) {
        	if(container.contains(i)) {
        		return true;
        	}
        	container.add(i);
        }
		
		return false;
    }
	
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(new ContainDuplicate().containsDuplicate(nums));
	}
}
