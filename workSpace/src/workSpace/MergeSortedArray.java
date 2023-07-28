package workSpace.src.workSpace;

import java.util.Arrays;

class MergeSortedArrayII extends MergeSortedArray {

	@Override
	public int[] mergeArray(int[] nums1, int[] nums2, int m, int n) {
		if (m <= 0) {
			return nums2;
		}

		if (n <= 0) {
			return nums1;
		}

		int last = m + n - 1;
		while (m > 0 && n > 0) {
			if (nums1[m - 1] > nums2[n - 1]) {
				nums1[last] = nums1[m - 1];
				m -= 1;
			} else {
				nums1[last] = nums2[n - 1];
				n -= 1;
			}
			last -= 1;
		}

		while (n > 0) {
			nums1[last] = nums2[n - 1];
			n -= 1;
			last -= 1;
		}
		return nums1;
	}

}

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
		int[] num1 = { 2, 2, 3, 0, 0, 0 };
		int[] num2 = { 1, 5, 6 };
		int m = 3;
		int n = 3;

		MergeSortedArray obj = new MergeSortedArrayII();
		num1 = obj.mergeArray(num1, num2, m, n);
		System.out.println(Arrays.toString(num1));
	}

}
