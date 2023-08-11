package workSpace.src.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2){
        if(s1.length() > s2.length()) return false;

        HashMap<Character, Integer> s1Map = new HashMap<>();
        int windowSize = s1.length();

        for (char i : s1.toCharArray()){
            if(s1Map.containsKey(i)){
                s1Map.put(i, s1Map.get(i) + 1);
            }else {
                s1Map.put(i, 1);
            }
        }

        int i = 0;
        while (i + windowSize <= s2.length()) {
            String subString = String.copyValueOf(s2.toCharArray(), i, windowSize);
            HashMap<Character, Integer> s2Map = new HashMap<>();
            for (char j : subString.toCharArray()){
                if(s2Map.containsKey(j)){
                    int count = s2Map.get(j) + 1;
                    s2Map.put(j, count);
                }else {
                    s2Map.put(j, 1);
                }
            }

            int flag = 0;
            for(char j : s1Map.keySet()) {
                int s1Count = s1Map.get(j);
                int s2Count = s2Map.get(j) == null ? 0 : s2Map.get(j);
                if(s1Count == s2Count) {
                    flag += 1;
                }
            }

            if(flag == s1Map.keySet().size()) {
                return true;
            }
            i++;
        }

        return false;
    }
    public static void main(String[] args) {
        String key = "ab";
        String value = "eidbaooo";

        System.out.println(new PermutationInString().checkInclusion(key, value));
    }
}
