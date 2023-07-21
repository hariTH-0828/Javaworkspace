package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElement {

	public int[] topKFrequent(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, List<Integer>> frequent = new HashMap<Integer, List<Integer>>();
		int[] result = new int[k];

		for (int i : nums) {
			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				int count = map.get(i);
				map.put(i, count + 1);
			}
		}

		for (int i : map.keySet()) {
			if (frequent.containsKey(map.get(i))) {
				frequent.get(map.get(i)).add(i);
			} else {
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				frequent.put(map.get(i), list);
			}
		}

		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 1, 2, 5, 2, 5, 3 };
		int k = 2;

		TopKFrequentElement frequents = new TopKFrequentElement();
		int[] topKelements = frequents.topKFrequent(nums, k);
		System.out.println(Arrays.toString(topKelements));
	}

}
