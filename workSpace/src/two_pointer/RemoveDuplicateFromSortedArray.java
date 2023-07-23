package workSpace.src.two_pointer;

public class RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums){
        int duplicates = 0;
        for(int i = 0; i < nums.length - 1; i++){
            int j = i + 1;
            if(nums[i] != nums[j]) {
                nums[duplicates] = nums[i];
                duplicates += 1;
            }
        }
        nums[duplicates] = nums[nums.length - 1];
        return duplicates+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(new RemoveDuplicateFromSortedArray().removeDuplicates(nums));
    }
}
