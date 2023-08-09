package workSpace.src.heap_priority;

import java.util.Arrays;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        int[] heapArray = new int[nums.length];
        int kthMax = 0;

        // creating heap array
        int j = 0;
        for(int i : nums){
            heapArray[j] = i;
            heapify(heapArray, j);
            j++;
        }

        int size = heapArray.length;
        while (k > 0){
            kthMax = heapArray[0];
            heapArray[0] = heapArray[size - 1];
            heapArray[size - 1] = 0;
            size--;
            extractMax(heapArray, 0, size);
            System.out.println(Arrays.toString(heapArray));
            k--;
        }
        return kthMax;
    }

    public void extractMax(int[] heapArray, int index, int size){
        int leftIndex = (index * 2) + 1;
        int rightChild = (index * 2) + 2;
        int maxValue = index;

        if(leftIndex < size && heapArray[maxValue] < heapArray[leftIndex]){
            maxValue = leftIndex;
        }
        if(rightChild < size && heapArray[maxValue] < heapArray[rightChild]){
            maxValue = rightChild;
        }

        if(maxValue != index){
            int temp = heapArray[maxValue];
            heapArray[maxValue] = heapArray[index];
            heapArray[index] = temp;
            extractMax(heapArray, maxValue, size);
        }
    }

    public void heapify(int[] heapArray, int index){
        int parentIndex = (index - 1) / 2;

        if(heapArray[parentIndex] < heapArray[index]){
            int temp = heapArray[parentIndex];
            heapArray[parentIndex] = heapArray[index];
            heapArray[index] = temp;
            heapify(heapArray, parentIndex);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1};
        int kthElement = new KthLargestElement().findKthLargest(nums, 1);
        System.out.println("Result : "+kthElement);
    }
}
