package workSpace;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeating {

	// VideoLink : https://www.youtube.com/watch?v=wiGpQwVHdE0

	int lengthOfSubString(String sentence) {
		Set<Character> set = new HashSet<Character>();
		int res = 0;
		for (int i = 0; i < sentence.length();) {
			if (!set.contains(sentence.charAt(i))) {
				set.add(sentence.charAt(i));
				res = Math.max(res, set.size());
				i++;
			}else {
				int l = 0;
				while (set.contains(sentence.charAt(i))) {
					set.remove(sentence.charAt(l));
					l += 1;
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
