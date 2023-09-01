package workSpace.src.workSpace;

public class ReplaceZeroWithFive {

    private int convertToFive(int num) {
        int result = 0; int factor = 1;
        while(num > 0) {
            if(num % 10 == 0) {
                result += (5 * factor);
            }else {
                result += (num % 10 * factor);
            }
            num = num / 10;
            factor *= 10;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums = 10010;
        System.out.println(new ReplaceZeroWithFive().convertToFive(nums));
    }
}
