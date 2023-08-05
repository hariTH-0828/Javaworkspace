package workSpace.src.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class WiggleSort {
    public void sort(int[] nums){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums){
            queue.add(i);
        }

        for(int i = 1; i < nums.length;){
            if(!queue.isEmpty()){
                nums[i] = queue.poll();
                i += 2;
            }
        }

        for(int i = 0; i < nums.length;){
            if(!queue.isEmpty()){
                nums[i] = queue.poll();
                i += 2;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,1,1,6,4};
        new WiggleSort().sort(nums);

        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
