package workSpace.src.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeating {

	// VideoLink : https://www.youtube.com/watch?v=wiGpQwVHdE0

	int lengthOfSubString(String sentence) {
		List<Character> listSet = new ArrayList<>();
		int res = 0;
		for (int i = 0; i < sentence.length();) {
			if (!listSet.contains(sentence.charAt(i))) {
				listSet.add(sentence.charAt(i));
				res = Math.max(res, listSet.size());
				i++;
			}else {
				while (listSet.contains(sentence.charAt(i))) {
					listSet.remove(0);
				}
			}
		}
		return res;
	}

	public static void main(String args[]) {
		String sentence = "aabaab!bb";
		LongestSubStringWithoutRepeating subString = new LongestSubStringWithoutRepeating();
		int result = subString.lengthOfSubString(sentence);
		System.out.println(result);
	}
}
