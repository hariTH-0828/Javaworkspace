package workSpace.src.workSpace;

import java.util.HashMap;
public class RomanToInteger {

    public int romanToInt(String roman){
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);

        for(int i = 0; i < roman.length(); i++){
            if(i + 1 < roman.length() && map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))){
                sum -= map.get(roman.charAt(i));
            }else {
                sum += map.get(roman.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String roman = "CCCD";
        System.out.println(new RomanToInteger().romanToInt(roman));
    }
}
