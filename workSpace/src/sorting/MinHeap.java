package workSpace.src.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        // Create a Max Heap by providing a custom comparator
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // To pass this value parameter to get the maxHeap : Collections.reverseOrder()  -> Like : PriorityQueue<>(Collections.reverseOrder());

        // Insert elements into the Max Heap
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(15);
        minHeap.add(20);
        minHeap.add(7);

        int length = minHeap.size();
        int[] maxArray = new int[length];
        for(int i = 0; i < length; i++){
            if(!minHeap.isEmpty()){
                maxArray[i] = minHeap.poll();
            }
        }

        System.out.println(Arrays.toString(maxArray));
    }
}
