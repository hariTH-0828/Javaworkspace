package workSpace.src.array;

import java.util.Arrays;

public class ReplaceElementWithGreater {
    /* keycode: https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/ */

    public int[] replaceElements(int[] arr) {
        int len = arr.length; int prev = -1;
        if(len == 1) {
            return new int[]{-1};
        }

        int i = len - 2; int j = len - 1;
        for(i = len - 2, j = len - 1; i >= 0; i--){
            if(arr[i] < arr[j]) {
                arr[i] = arr[j];
                arr[j] = prev;
                prev = arr[i];
            } else if(prev < arr[j]) {
                int temp = arr[j];
                arr[j] = prev;
                prev = temp;
            }
            j = i;
        }
        if(j == 0) {
            arr[j] = prev;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {17, 1};
        int[] result = new ReplaceElementWithGreater().replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }
}
