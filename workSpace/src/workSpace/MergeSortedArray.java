package workSpace;

import java.util.Arrays;

public class MergeSortedArray {

	public int[] mergeArray(int[] nums1, int[] nums2, int m, int n) {

		if (m <= 0) {
			System.out.print(nums2);
		}

		if (n <= 0) {
			System.out.print(nums1);
		}

		int i = 0;
		int j = 0;
		for (i = 0; i < nums1.length && j < nums2.length; i++) {
			if (nums1[i] < nums2[j]) {
				continue;
			} else {
				while (m > i) {
					nums1[m] = nums1[m - 1];
					m -= 1;
				}
				nums1[i] = nums2[j];
				j++;
				m = (nums1.length - (nums2.length - j));
			}
		}

		if (j < nums2.length) {
			i = nums1.length - (nums2.length - j);

			while (i < nums1.length) {
				nums1[i] = nums2[j];
				i += 1;
				j += 1;
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
