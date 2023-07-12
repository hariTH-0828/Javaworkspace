package workSpace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateChecker {

	public static void main(String args[]) {
		String number = "1123435";
		HashMap<Character, Integer> set = new HashMap<Character, Integer>();
		
		for (char i : number.toCharArray()) {
			int count = set.containsKey(i) ? set.get(i) : 0;
			set.put(i, count + 1);
		}

		Set<Character> keyset = set.keySet();
		for (char i : keyset) {
			if (set.get(i) > 1) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\n***Working with Iterator***");
		Iterator<Character> iterator = keyset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}
