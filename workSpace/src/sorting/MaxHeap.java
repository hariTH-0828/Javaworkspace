package workSpace.src.sorting;

import java.util.Arrays;

public class MaxHeap {
    private final int[] heapArray;
    private int size;
    private final int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        heapArray = new int[capacity];
        size = 0;
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    private void heapifyUp(int index) {
        int parentIndex = getParentIndex(index);
        if (parentIndex >= 0 && heapArray[index] > heapArray[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int largest = index;
        int leftChildIndex = getLeftChildIndex(index);
        int rightChildIndex = getRightChildIndex(index);

        if (leftChildIndex < size && heapArray[leftChildIndex] > heapArray[largest]) {
            largest = leftChildIndex;
        }

        if (rightChildIndex < size && heapArray[rightChildIndex] > heapArray[largest]) {
            largest = rightChildIndex;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full. Cannot insert more elements.");
        }

        heapArray[size] = value;
        heapifyUp(size);
        size++;
    }

    public int poll() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty. Cannot extract maximum.");
        }

        int max = heapArray[0];
        heapArray[0] = heapArray[size - 1];
        heapArray[size - 1] = 0;
        size--;
        heapifyDown(0);
        return max;
    }

    public int getMax(){
        if(size == 0){
            throw new IllegalStateException("Heap is empty. Cannot get maximum");
        }
        return heapArray[0];
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        for(int i : arr){
            maxHeap.insert(i);
        }

        System.out.println("Max Heap array: " + Arrays.toString(maxHeap.heapArray));

        int maxElement = maxHeap.getMax();
        System.out.println("Extracted maximum element: " + maxElement);

        System.out.println("Polling : "+maxHeap.poll());

        System.out.println("Max Heap array after extraction: " + Arrays.toString(maxHeap.heapArray));
    }
}
