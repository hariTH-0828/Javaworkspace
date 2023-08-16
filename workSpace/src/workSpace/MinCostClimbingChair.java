package workSpace.src.workSpace;

import workSpace.src.sorting.MaxHeapSort;

import java.util.Stack;

public class MinCostClimbingChair {

    public int minCostClimbingChair(int[] costs) {
        for(int i = costs.length - 3; i >= 0; i--) {
            costs[i] += Math.min(costs[i + 1], costs[i + 2]);
        }

        return Math.min(costs[0], costs[1]);
    }

    public static void main(String[] args) {
        int[] costs = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(new MinCostClimbingChair().minCostClimbingChair(costs));
    }
}
