package workSpace.src.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {

    int[] nums;
    int k;
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    public KthLargestElement(int k, int[] nums){
        initialize(k, nums);
    }

    private void initialize(int k, int[] nums) {
        this.nums = nums;
        this.k = k;

        for(int i : nums) {
            priorityQueue.add(i);
        }
    }

    public int add(int val){
        priorityQueue.add(val);
        int kthMax = 0;
        for(int i = 0; i < k; i++){
            if(!priorityQueue.isEmpty()){
                kthMax = priorityQueue.poll();
            }
        }

        return kthMax;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargestElement kthElement = new KthLargestElement(3, nums);
        System.out.println(kthElement.add(3));
        System.out.println(kthElement.add(5));
    }
}
