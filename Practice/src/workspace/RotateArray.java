package workspace;

import java.util.Arrays;


// Rotate Array from K-th Right from the array
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;

        int[] newArr = new int[len];
        int j = 0;

        for(int i = len - k; i < len; i++){
            newArr[j] = nums[i];
            ++j;
        }

        for(int i = 0; i < len-k; i++){
            newArr[j] = nums[i];
            ++j;
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 3;

        obj.rotate(nums, k);
    }
}
