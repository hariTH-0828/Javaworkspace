package workSpace.src.array;

public class MissingNumber {

    private int findMissing(int[] nums) {
        // formula to find the sum of the array elements :
        int len = nums.length;
        int requiredSum = (len * (len + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        return requiredSum - sum;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int number = new MissingNumber().findMissing(nums);
        System.out.println(number);
    }
}
