package workSpace.src.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hashMap = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if(!hashMap.containsKey(pattern.charAt(i))) {
                if(hashMap.containsValue(words[i])) return false;
                hashMap.put(pattern.charAt(i), words[i]);
            }else {
                if(!hashMap.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abab";
        String s = "dog cat cat dog";
        boolean isMatch = new WordPattern().wordPattern(pattern, s);
        System.out.println(isMatch);
    }
}
