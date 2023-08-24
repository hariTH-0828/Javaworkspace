package workSpace.src.array;

public class RangeSum {

    int[] numArray;
    public RangeSum(int[] nums) {
         this.numArray = nums;
    }

    public int sumRange(int left, int right) {
        int sum = numArray[left];
        while (left < right) {
            sum += numArray[right];
            right--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSum object = new RangeSum(nums);
        System.out.println(object.sumRange(0,2));
        System.out.println(object.sumRange(2,5));
        System.out.println(object.sumRange(0,5));
    }
}
