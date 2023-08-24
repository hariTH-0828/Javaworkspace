package workSpace.src.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.Stack;

public class NextGreaterI {

    // Optimal solution Constrains : O(N+M)
    public int[] nextGreater(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> mapIndex = new HashMap<>();

        // set default value -1 in result array
        for (int i = 0; i < result.length;) result[i++] = -1;
        // Creating Hashmap for nums1
        for (int i = 0; i < nums1.length;) mapIndex.put(nums1[i], i++);

        Stack<Integer> stack = new Stack<>();
        for (int j : nums2) {
            while (!stack.isEmpty() && j > stack.peek()) {
                int value = stack.pop();
                int index = mapIndex.get(value);
                result[index] = j;
            }
            if (mapIndex.containsKey(j)) {
                stack.add(j);
            }
        }
        return result;
    }

    // Constrains : O(N^M)
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int max = -1;
            for (int j = nums2.length - 1; j >= i; j--) {
                if(nums1[i] == nums2[j]) {
                    result[i] = max;
                    break;
                }
                if(nums1[i] < nums2[j]) {
                    max = nums2[j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,2,3,4};
        int[] result = new NextGreaterI().nextGreater(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}
