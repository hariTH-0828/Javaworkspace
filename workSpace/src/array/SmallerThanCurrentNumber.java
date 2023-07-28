package workSpace.src.array;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }else if(nums[i] > nums[j]){
                    count +=1;
                }
            }
            result[i] = count;
            count = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        SmallerThanCurrentNumber object = new SmallerThanCurrentNumber();
        int[] result = object.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
}
