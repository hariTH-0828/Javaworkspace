package workSpace.src.sorting;

import java.util.Arrays;

public class MaxHeapSort {

    private final int[] heapArray;
    private final int capacity;
    private int size;

    public MaxHeapSort(int capacity){
        heapArray = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public void insert(int value){
        if(size > capacity){
            throw new IllegalStateException("Heap is out of space. Cannot insert the value");
        }

        heapArray[size] = value;
        heapify(size);
        size++;
    }

    public int getParentNode(int index){
        return (index - 1) / 2;
    }

    public int getLeftChild(int parentIndex){
        return (parentIndex * 2) + 1;
    }

    public int getRightChild(int parentIndex){
        return (parentIndex * 2) + 2;
    }

    public void heapify(int index){
        int parentNode = getParentNode(index);

        if(parentNode >= 0 && heapArray[index] > heapArray[parentNode]){
            swap(index, parentNode);
            heapify(parentNode);
        }
    }

    public int poll() {
        if(size == 0){
            throw new IllegalStateException("Heap is empty. Cannot poll() function is work");
        }

        int maxValue = getMax();
        heapArray[0] = getMin();
        heapArray[size - 1] = 0;
        size--;
        delete(0);

        return maxValue;
    }

    private void delete(int index){
        int maxValue = index;
        int leftChild = getLeftChild(index);
        int rightChild = getRightChild(index);

        if(leftChild < size && heapArray[maxValue] < heapArray[leftChild]){
            maxValue = leftChild;
        }

        if(rightChild < size && heapArray[maxValue] < heapArray[rightChild]){
            maxValue = rightChild;
        }

        if(maxValue != index){
            swap(index, maxValue);
            delete(maxValue);
        }
    }
    public int getMax(){
        if(size == 0){
            throw new IllegalStateException("Heap is empty. Cannot get max");
        }
        return heapArray[0];
    }

    public int getMin(){
        if(size == 0){
            throw new IllegalStateException("Heap is empty. Cannot get min");
        }
        return heapArray[size - 1];
    }

    public void swap(int i, int j){
        int temp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(heapArray);
    }

    public static void main(String[] args) {
        MaxHeapSort heapSort = new MaxHeapSort(10);
        int[] arr = {12, 11, 13, 5, 6, 7, 1, 4};
        for(int i : arr){
            heapSort.insert(i);
        }

        System.out.println(heapSort);
        System.out.println("Polling : "+heapSort.poll());
        System.out.println(heapSort);
        System.out.println("Polling : "+heapSort.poll());
        System.out.println(heapSort);
        System.out.println("Polling : "+heapSort.poll());
    }
}
