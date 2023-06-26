package workSpace;

import java.util.ArrayList;
import java.util.List;

public class KPairWithSmallestNumber {

	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> pairs = new ArrayList<List<Integer>>();

		// It create a List of List Possible pairs from the given both array
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				List<Integer> possiblePairs = new ArrayList<Integer>();
				possiblePairs.add(nums1[i]);
				possiblePairs.add(nums2[j]);
				pairs.add(possiblePairs);
			}
		}

		// It sort the list in ascending order from the pairs list
		int min = pairs.get(0).get(0) + pairs.get(0).get(1);
		for (int i = 1; i < pairs.size(); i++) {
			int sum = pairs.get(i).get(0) + pairs.get(i).get(1);
			if (sum > min) {
				min = sum;
			}else {
				int j = i - 1;
				while (j >= 0) {
					if (min > sum) {
						j -= 1;
					} else {
						pairs.add(j + 1, pairs.get(i));
						pairs.remove(i + 1);
						min = pairs.get(i).get(0) + pairs.get(i).get(1);
						j -= 1;
						break;
					}
					min = pairs.get(j).get(0) + pairs.get(j).get(1);
				}
			}
		}

		if (k > pairs.size()) {
			return pairs;
		} else {
			List<List<Integer>> resultPairs = new ArrayList<List<Integer>>();
			for (int i = 0; i < k; i++) {
				resultPairs.add(pairs.get(i));
			}
			return resultPairs;
		}
    }

	public static void main(String args[]) {
		KPairWithSmallestNumber obj = new KPairWithSmallestNumber();
		int[] nums1 = { 1, 1, 2 };
		int[] nums2 = { 1, 2, 3 };
		int k = 3;

		List<List<Integer>> pairs = new ArrayList<List<Integer>>();
		pairs = obj.kSmallestPairs(nums1, nums2, k);

		System.out.print(pairs.toString());
	}
}
