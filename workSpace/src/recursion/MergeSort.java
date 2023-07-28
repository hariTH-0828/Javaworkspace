package workSpace.src.recursion;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] array){

        if(array == null || array.length <= 1){
            return array;
        }

        int mid = array.length / 2;

        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = array[i];
        }

        for(int i = mid; i < array.length; i++){
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);

        return array;
    }

    public void merge(int[] array, int[] leftArray, int[] rightArray){
        int leftIndex = 0; int rightIndex = 0; int currentIndex = 0;

        while(leftIndex < leftArray.length && rightIndex < rightArray.length){
            if(leftArray[leftIndex] <= rightArray[rightIndex]){
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // If any of the elements are remain in leftArray
        while (leftIndex < leftArray.length){
            array[currentIndex] = leftArray[leftIndex];
            leftIndex++;
        }

        // If any of the elements are remain in rightArray
        while(rightIndex < rightArray.length){
            array[currentIndex] = rightArray[rightIndex];
            rightIndex++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {38,27,43,3,9,82,10};

        System.out.println("Array before Sorted : ");
        System.out.println(Arrays.toString(nums));

        MergeSort sort = new MergeSort();
        nums = sort.mergeSort(nums);

        System.out.println();
        System.out.println("Array after sorted : ");
        System.out.println(Arrays.toString(nums));


    }
}