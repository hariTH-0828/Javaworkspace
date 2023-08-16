package workSpace.src.array;

public class LengthOfLastWord {

    public int wordLength(String word) {
        word = word.trim();
        int i = word.length() - 1; int count = 0;
        while(i >= 0){
            if(word.charAt(i) != ' '){
                count += 1;
                i--;
            }else break;
        }
        return count;
    }
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(new LengthOfLastWord().wordLength(word));
    }
}
