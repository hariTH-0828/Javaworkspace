package competetion;

public class SpellNumber {

	public String spellNumber(String str) {
		int count = 1;
		String res = "";
		for (int i = 0; i < str.length();) {
			for(int j = i; j < str.length() - 1;) {
				if (str.charAt(j) == str.charAt(j + 1)) {
					count += 1;
					j++;
				}
				else {
					res = "" + count + str.charAt(i);
					i = j;
					count = 1;
					break;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str;
		str = "11";
		SpellNumber sn = new SpellNumber();
		System.out.println(sn.spellNumber(str));
	}
}

