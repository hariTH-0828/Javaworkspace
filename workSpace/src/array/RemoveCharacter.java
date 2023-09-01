package workSpace.src.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharacter {

    private String removeChar(String string, String subString) {
        String builderString = "";
        int[] alphabets = new int[26];
        for (char i : subString.toCharArray()) {
            int index = (int) i - 97;
            alphabets[index]++;
        }
        for (char i : string.toCharArray()) {
            int index = (int) i - 97;
            if(alphabets[index] == 0) {
                builderString += i;
            }
        }
        return builderString;
    }

    private String shrink(String string, String subString) {
        String builderString = "";
        List<Character> list = new ArrayList<>(); // Here we take any one of them set or list
        for (char i : subString.toCharArray()) list.add(i);
        for (char i : string.toCharArray()) {
            if(!list.contains(i)) {
                builderString += i;
            }
        }
        return builderString;
    }
    public static void main(String[] args) {
        String string = "occurrence";
        String subString = "cat";
        System.out.println(new RemoveCharacter().shrink(string, subString));
    }
}
