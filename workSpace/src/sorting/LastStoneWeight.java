package workSpace.src.sorting;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones){
            queue.add(i);
        }

        while(queue.size() > 1){
            int result = queue.poll() - queue.poll();
            if(result > 0){
                queue.add(result);
            }
        }

        if(!queue.isEmpty()) return queue.peek();
        return 0;
    }

    public static void main(String[] args) {
        int[] stones = {2,2};
        System.out.println(new LastStoneWeight().lastStoneWeight(stones));
    }
}
