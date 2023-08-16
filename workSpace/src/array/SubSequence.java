package workSpace.src.array;

public class SubSequence {
    public boolean isSubSequence(String original, String relative) {
        int i = 0; int j = 0;
        for(; i < relative.length(); i++) {
            if(j < original.length() && original.charAt(j) == relative.charAt(i)) {
                j++;
            }
        }

        if(j < original.length()) return false;
        return true;
    }

    public static void main(String[] args) {
        String original = "axc";
        String relative = "ahbgdc";
        System.out.println(new SubSequence().isSubSequence(original, relative));
    }
}
