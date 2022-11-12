package workspace;

public class Palindrome {

    public static boolean isPalindrome(String word){
        int left, right = word.length() - 1;

        for(left = 0; left < right; ){
            if(word.charAt(left) == word.charAt(right)){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "mesam";
        System.out.println(isPalindrome(word));
    }
}
