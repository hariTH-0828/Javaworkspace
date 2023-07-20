package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public List<List<String>> groupAnagram(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String i : strs) {
			char[] temp = i.toCharArray();
			Arrays.sort(temp);
			
			if (map.containsKey(String.valueOf(temp))) {
				map.get(String.valueOf(temp)).add(i);
			} else {
				List<String> container = new ArrayList<>();
				container.add(i);
				map.put(String.valueOf(temp), container);
			}
		}
		List<List<String>> listOfLists = new ArrayList<List<String>>(map.values());
		return listOfLists;
	}


	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		new GroupAnagrams().groupAnagram(strs);
	}
}
