package workSpace.src.array;

public class RemoveElement {

    public int remove(int[] nums, int val) {
        int fastMove = nums.length - 1;
        int blanker = nums.length - 1;

        for ( ; fastMove >= 0; fastMove--) {
            if(nums[fastMove] == val) {
                nums[fastMove] = nums[blanker];
                nums[blanker] = 0;
                blanker--;
            }
        }
        return blanker + 1;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 2;
        System.out.println(new RemoveElement().remove(nums, val));
    }
}
