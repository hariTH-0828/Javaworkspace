package workSpace.src.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    int[] nums;
    int k;
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public KthLargestElement(int k, int[] nums){
        this.k = k;
        this.nums = nums;

        for(int i : nums){
            priorityQueue.add(i);
        }
    }

    public int add(int val){
        priorityQueue.add(val);
        while(priorityQueue.size() > k) {
            priorityQueue.poll();
        }

        if(!priorityQueue.isEmpty()){
            return priorityQueue.peek();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargestElement kthElement = new KthLargestElement(3, nums);
        System.out.println(kthElement.add(3));
        System.out.println(kthElement.add(5));
        System.out.println(kthElement.add(10));
        System.out.println(kthElement.add(9));
        System.out.println(kthElement.add(4));
    }
}
