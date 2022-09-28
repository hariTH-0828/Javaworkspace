package workspace;

public class OddEvenNumberArrange {

    public static void main(String[] args) {
        String num = "67854";
        int x = 0;
        String num_word = "";

        for(int i = x; i < num.length(); ){
            num_word += num.charAt(i)+"";
            i += 2;
        }

        for(int i = 1; i < num.length(); ){
            num_word += num.charAt(i)+"";
            i += 2;
        }

        System.out.println(num_word);
    }
}
