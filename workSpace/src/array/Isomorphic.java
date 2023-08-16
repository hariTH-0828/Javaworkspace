package workSpace.src.array;

import java.util.HashMap;

public class Isomorphic {

    public boolean isIsomorphic(String string, String test) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        int sIndex = 0, tIndex = 0;

        for (; sIndex < string.length(); sIndex++) {
            char c1 = string.charAt(sIndex);
            char c2 = test.charAt(tIndex);
            if( (sMap.containsKey(c1) && sMap.get(c1) != c2) || (tMap.containsKey(c2) && tMap.get(c2) != c1)) {
                return false;
            }
            sMap.put(c1, c2); tMap.put(c2, c1);
            tIndex += 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "egg";
        String test = "add";
        System.out.println(new Isomorphic().isIsomorphic(string, test));
    }
}
