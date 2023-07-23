package workSpace.src.two_pointer;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if(s.trim().isEmpty()) return true;
		/* A man, a plan, a canal: Panama */
		for(int i = 0, j = s.length() - 1; i < j;){
			char leftChar = s.charAt(i);
			char rightChar = s.charAt(j);
			if(!Character.isLetterOrDigit(leftChar)){
				i++;
			}else if(!Character.isLetterOrDigit(rightChar)){
				j--;
			}else {
				if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
					return false;
				}
				i++;
				j--;
			}
		}
		return true;
	}

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
		ValidPalindrome palindrome = new ValidPalindrome();
		boolean result = palindrome.isPalindrome("0P");
		if (result) {
			System.out.println("Palindrome");
		}
	}

}
