package array;

import java.util.Arrays;
import java.util.HashMap;

class ValidateAnagram extends ValidAnagram {

	@Override
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		Arrays.sort(sChar);
		Arrays.sort(tChar);

		s = String.valueOf(sChar);
		t = String.valueOf(tChar);

		if (s.equals(t))
			return true;

		return false;
	}
}
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> sHolder = new HashMap<>();
		HashMap<Character, Integer> tHolder = new HashMap<>();
		for (char i : s.toCharArray()) {
			int count = sHolder.get(i) != null ? sHolder.get(i) : 0;
			sHolder.put(i, count + 1);
		}

		for (char i : t.toCharArray()) {
			int count = tHolder.get(i) != null ? tHolder.get(i) : 0;
			tHolder.put(i, count + 1);
		}

		for (char i : sHolder.keySet()) {
			int sCount = sHolder.get(i);
			int tCount = tHolder.get(i) == null ? 0 : tHolder.get(i);
			if (sCount != tCount) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String s = "oneplus";
		String t = "plusone";
		System.out.println(new ValidateAnagram().isAnagram(s, t));
	}

}
