package workSpace.src.array;

public class RemoveDuplicate {

    private static int findDuplicate(int[] nums) {
        int slowPtr = 0; int fastPtr = 1;
        while(fastPtr < nums.length) {
            if(nums[slowPtr] != nums[fastPtr]) {
                nums[slowPtr+1] = nums[fastPtr];
                slowPtr++; fastPtr++;
            }else {
                fastPtr++;
            }
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        // elements are sorted in array
        int[] nums = {1,2,3,4,4,5,6};
        int range = findDuplicate(nums);

        for (int i = 0; i <= range; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
