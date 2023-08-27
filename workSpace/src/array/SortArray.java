package workSpace.src.array;

import java.util.Arrays;

public class SortArray {

    public int[] sortArray(int[] nums) {
        /*
         * There is two ways to solve this problem of sort the array in O(NlogN)
         *  # Min-Heap
         *  # Merge-sort
         */
        return mergeSort(nums);
    }

    public int[] mergeSort(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            rightArray[i - mid] = nums[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        mergeArray(nums, leftArray, rightArray);

        return nums;
    }

    public void mergeArray(int[] sourceArray, int[] leftArray, int[] rightArray) {
        int leftIndex = 0; int rightIndex = 0; int index = 0;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] <= rightArray[rightIndex]){
                sourceArray[index] = leftArray[leftIndex];
                leftIndex++;
            }else {
                sourceArray[index] = rightArray[rightIndex];
                rightIndex++;
            }
            index++;
        }

        // If any of the elements are remain in leftArray
        while (leftIndex < leftArray.length){
            sourceArray[index++] = leftArray[leftIndex];
            leftIndex++;
        }

        // If any of the elements are remain in rightArray
        while(rightIndex < rightArray.length){
            sourceArray[index++] = rightArray[rightIndex];
            rightIndex++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {6,3,8,1,2,0,7,5};
        SortArray sortArray = new SortArray();
        int[] result = sortArray.sortArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
