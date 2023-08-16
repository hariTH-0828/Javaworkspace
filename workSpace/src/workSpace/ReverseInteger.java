package workSpace.src.workSpace;

public class ReverseInteger {
    public int reverse(int value) {
        int MIN = -2147483648;
        int MAX = 2147483647;

        int result = 0;
        while (Math.abs(value) > 0) {
            int digit = value % 10;
            value = value / 10;

            if(result > (MAX / 10) || (result == MAX / 10 && digit >= MAX % 10)) {
                return 0;
            }
            if(result < (MIN / 10) || (result == MIN / 10 && digit <= MIN % 10)) {
                return 0;
            }
            result = (result * 10) + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums = -1463847412;
        int result = new ReverseInteger().reverse(nums);
        System.out.println(result);
    }
}
