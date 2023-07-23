package workSpace.src.array;

import java.util.Arrays;
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxSq = 1;
        int count = 1;

        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i] == nums[i+1] - 1){
                count += 1;
            }else {
                if(maxSq < count) maxSq = count;
                count = 1;
            }
        }
        maxSq = maxSq < count ? count : maxSq;

        return maxSq;
    }

    public static void main(String[] args) {

        int[] nums = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums));
    }
}
