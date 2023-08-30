package workSpace.src.array;

public class Strstr {

    private int isContain(String string, String subString) {
        int index = -1; int j = 0;

        for (int i = 0; i < string.length(); ) {
            if(subString.charAt(0) == string.charAt(i)) {
                while (j < subString.length() && i < string.length()) {
                    if(string.charAt(i) != subString.charAt(j)) {
                        i = i - j + 1;
                        j = 0;
                        break;
                    }
                    i++; j++;
                }
                if(j == subString.length()) {
                    index = i - subString.length();
                    return index;
                }
            }else {
                i++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String word = "mississippi";
        String subString = "pi";
        System.out.println(new Strstr().isContain(word, subString));
    }
}
