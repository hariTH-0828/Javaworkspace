package workSpace.src.array;

import java.util.HashSet;

public class LongestCommonPrefix {

    public String getPrefix(String[] strings) {
        String res = "";
        for (int i = 0; i < strings[0].length(); i++) {
            for (int j = 0; j < strings.length; j++) {
                if(i == strings[j].length() || strings[0].charAt(i) != strings[j].charAt(i)){
                    return res;
                }
            }
            res += strings[0].charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] strings = {"ab","a"};
        System.out.println(new LongestCommonPrefix().getPrefix(strings));
    }
}
