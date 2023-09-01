package workSpace.src.array;

public class FrontBackTransformation {

    private String convert(String word) {
        String cWord = "";
        for (char i : word.toCharArray()) {
            if((int) i >= 65 && (int) i <= 90) {
                int index = 90 - ((int) i - 65);
                cWord += (char) index;
            }else {
                int index = 122 - ((int) i - 97);
                cWord += (char) index;
            }
        }
        return cWord;
    }
    public static void main(String[] args) {
        String word = "hello";
        System.out.println(new FrontBackTransformation().convert(word));
    }
}
