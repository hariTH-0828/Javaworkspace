package workSpace.src.sorting;

import java.util.Arrays;

public class MinHeapSort {

    int[] heapArray; int size; int capacity;

    public MinHeapSort(int capacity) {
        this.heapArray = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    private int getParentIndex(int index){
        return (index - 1) / 2;
    }

    private int getLeftIndex(int index){
        return (index * 2) + 1;
    }

    private int getRightIndex(int index){
        return (index * 2) + 2;
    }

    public void insert(int value){
        if(size > capacity){
            throw new IllegalStateException("Heap size is full.");
        }

        heapArray[size] = value;
        heapify(size);
        size++;
    }

    private void heapify(int index){
        int parent = getParentIndex(index);

        if(heapArray[parent] > heapArray[index]){
            swap(index, parent);
            heapify(parent);
        }
    }

    private void swap(int index, int parent){
        int temp = heapArray[index];
        heapArray[index] = heapArray[parent];
        heapArray[parent] = temp;
    }

    public int poll(){
        if(size == 0){
            throw new IllegalStateException("Heap is empty. Cannot poll()");
        }

        int minValue = getMin();
        heapArray[0] = getMax();
        heapArray[size - 1] = 0;
        size--;
        pop(0);

        return minValue;
    }

    private int getMin(){
        return heapArray[0];
    }

    private int getMax(){
        return heapArray[size - 1];
    }

    private void pop(int index){
        int leftChildIndex = getLeftIndex(index);
        int rightChildIndex = getRightIndex(index);
        int minIndex = index;

        if(leftChildIndex < size && heapArray[minIndex] > heapArray[leftChildIndex]){
            minIndex = leftChildIndex;
        }

        if(rightChildIndex < size && heapArray[minIndex] > heapArray[rightChildIndex]){
            minIndex = rightChildIndex;
        }

        if(minIndex != index){
            swap(index, minIndex);
            pop(minIndex);
        }
    }

    public boolean isEmpty() {
        if(size > 0){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(heapArray);
    }

    public static void main(String[] args) {
        MinHeapSort minHeapSort = new MinHeapSort(10);
        minHeapSort.insert(10);
        minHeapSort.insert(9);
        minHeapSort.insert(8);
        minHeapSort.insert(5);
        minHeapSort.insert(2);
        minHeapSort.insert(3);
        minHeapSort.insert(4);

        int[] sortedArray = new int[minHeapSort.capacity];
        int i = 0;
        while(!minHeapSort.isEmpty()){
            sortedArray[i] = minHeapSort.poll();
            i++;
        }

        System.out.println(Arrays.toString(sortedArray));
    }
}
