package workSpace;

public class Palindrome {

	public boolean isPalindrome(int x) {
		int num = 0;
		int xCopy = x;
		if (x > 0) {
			while (x > 0) {
				num = num * 10 + (x % 10);
				x = x / 10;
			}
		}

		if (xCopy == num) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		Palindrome palindrome = new Palindrome();
		boolean result = palindrome.isPalindrome(132);
		if (result) {
			System.out.println("Palindrome");
		}
	}

}
