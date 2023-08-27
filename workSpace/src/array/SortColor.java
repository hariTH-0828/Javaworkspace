package workSpace.src.array;

import java.util.Arrays;

public class SortColor {
    public void sortColors(int[] nums) {
        int low = 0; int mid = 0; int high = nums.length - 1;
        while (mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++; mid++;
            }else if(nums[mid] == 1) mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

    public static void main(String[] args) {
        int[] colorArray = {1, 2, 0, 0, 2, 1};
        SortColor object = new SortColor();
        object.sortColors(colorArray);
    }
}
