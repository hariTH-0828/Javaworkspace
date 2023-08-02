package workSpace.src.sorting;

public class MergeSort {

    public int[] mergeSort(int[] nums){

        if(nums == null || nums.length <= 1){
            return nums;
        }

        int mid = nums.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[nums.length - mid];


        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = nums[i];
        }

        for(int i = mid; i < nums.length; i++){
            rightArray[i - mid] = nums[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(nums, leftArray, rightArray);

        return nums;
    }

    public void merge(int[] nums, int[] leftArray, int[] rightArray){
        int leftIndex = 0; int rightIndex = 0; int currentIndex = 0;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] <= rightArray[rightIndex]){
                nums[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }else {
                nums[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // If any of the elements are remain in leftArray
        while (leftIndex < leftArray.length){
            nums[currentIndex] = leftArray[leftIndex];
            leftIndex++;
        }

        // If any of the elements are remain in rightArray
        while(rightIndex < rightArray.length){
            nums[currentIndex] = rightArray[rightIndex];
            rightIndex++;
        }

    }
    public static void main(String[] args) {
        int[] nums = { 31, 41, 59, 26, 41, 58 };
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(nums);
    }
}
