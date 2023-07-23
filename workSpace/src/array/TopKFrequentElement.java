package workSpace.src.array;

import java.util.*;

public class TopKFrequentElement {

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}

		// Step 2: Group elements by frequency
		Map<Integer, List<Integer>> frequentMap = new HashMap<>();
		for (int num : frequencyMap.keySet()) {
			int frequency = frequencyMap.get(num);
			frequentMap.computeIfAbsent(frequency, key -> new ArrayList<>()).add(num);
		}

		// Step 3: Get the top k frequent elements
		int[] result = new int[k];
		int i = 0;
		for (int freq = nums.length; freq >= 0 && i < k; freq--) {
			if (frequentMap.containsKey(freq)) {
				List<Integer> elements = frequentMap.get(freq);
				for (int num : elements) {
					result[i++] = num;
					if (i == k) break;
				}
			}
		}

		return result;
	}

	public static int[] kFrequentElement(int[] nums, int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, List<Integer>> frequent = new HashMap<>();

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

		int[] list = frequent.values().stream()
				.flatMap(List::stream)
				.mapToInt(Integer::intValue).toArray();
		int[] result = new int[k];
		int j = 0;
		for(int i = list.length - 1; i >= 0 && j < k; i--){
			result[j] = list[i];
			j++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, 2, 4, 5, 6, 1, 2, 5, 3 };
		int k = 2;

		int[] topKelements = TopKFrequentElement.topKFrequent(nums, k);
		System.out.println(Arrays.toString(topKelements));
	}

}
