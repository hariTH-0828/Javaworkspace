package workSpace;

import java.util.HashMap;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> countS = new HashMap<Character, Integer>();
		HashMap<Character, Integer> countT = new HashMap<Character, Integer>();

		if (s.length() != t.length())
			return false;

		for (int i = 0; i < s.length(); i++) {

			if (countS.containsKey(s.charAt(i))) {
				int count = countS.get(s.charAt(i));
				countS.put(s.charAt(i), count + 1);
			} else
				countS.put(s.charAt(i), 1);

			if (countT.containsKey(t.charAt(i))) {
				int count = countT.get(t.charAt(i));
				countT.put(t.charAt(i), count + 1);
			} else
				countT.put(t.charAt(i), 1);
		}

		for (char i : countS.keySet()) {
			if (countT.containsKey(i) && countS.get(i) == countT.get(i)) {
				continue;
			} else
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "oneplus";
		String t = "plustwo";

		ValidAnagram validAnagram = new ValidAnagram();
		boolean result = validAnagram.isAnagram(s, t);
		System.out.println(result);
	}

}
