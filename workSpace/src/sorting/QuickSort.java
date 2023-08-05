package workSpace.src.sorting;

import java.util.Arrays;

public class QuickSort {

    public int sort(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums, i, j);
            }
        }

        swap(nums, i+1, high);

        return i+1;
    }

    private void swap(int[] numArray, int indexLow, int indexHigh){
        int temp = numArray[indexLow];
        numArray[indexLow] = numArray[indexHigh];
        numArray[indexHigh] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {10, 80, 30, 90, 40, 50, 70};
        QuickSort quickSort = new QuickSort();

        int pivot = quickSort.sort(nums, 0, nums.length - 1);
        quickSort.sort(nums, 0, pivot - 1);
        quickSort.sort(nums, pivot + 1, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}
