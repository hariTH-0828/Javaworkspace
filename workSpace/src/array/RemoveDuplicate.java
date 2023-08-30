package workSpace.src.array;

public class RemoveDuplicate {

    private static int findDuplicate(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; ) {
            if(nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++; j++;
            }else {
                j++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        // elements are sorted in array
        int[] nums = {1,2,3,4,5,6};
        int range = findDuplicate(nums);

        for (int i = 0; i <= range; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
