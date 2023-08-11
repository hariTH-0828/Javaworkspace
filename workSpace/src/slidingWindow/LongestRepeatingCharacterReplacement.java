package workSpace.src.slidingWindow;

import java.util.Collections;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k){
        int maxf = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        for( ;right < s.length(); right++){
            // Add char to map
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), 1);
            }else {
                int count = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), count);
            }
            // After add char to map then check the left , right window is valid or not
            int windowSize = (right + 1) - left;
            int maxValue = getMaxValue(map);

            if(windowSize - maxValue > k) {
                int count = map.get(s.charAt(left)) - 1;
                map.put(s.charAt(left), count);
                left++;
            }else {
                maxf = Math.max(maxf, windowSize);
            }
        }
        return maxf;
    }

    public int getMaxValue(HashMap<Character, Integer> map){
        int maxValue = Integer.MIN_VALUE;
        for(int i : map.values()){
            if(maxValue < i){
                maxValue = i;
            }
        }

        return maxValue;
    }
    public static void main(String[] args) {
        String s = "AAABCABBBCCC";
        int value = new LongestRepeatingCharacterReplacement().characterReplacement(s, 3);
        System.out.println(value);
    }
}
