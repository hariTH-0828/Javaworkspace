package workSpace;

import java.util.Arrays;

public class MergeSortedArray {

	public int[] mergeArray(int[] nums1, int[] nums2, int m, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (j >= 0) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		return nums1;
	}

	public static void main(String args[]) {
		int[] num1 = { 1, 2, 3, 4, 0, 0, 0 };
		int[] num2 = { 1, 2, 2 };
		int m = 4;
		int n = 3;

		MergeSortedArray obj = new MergeSortedArray();
		num1 = obj.mergeArray(num1, num2, m, n);
		System.out.println(Arrays.toString(num1));
	}

}
