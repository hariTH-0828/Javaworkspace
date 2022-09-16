package workspace;

import java.util.Arrays;

public class MergeSort {

    void sort(int[] arr, int l, int r){
        if(l < r){
            int m = l + (r-l) / 2;

            sort(arr, 0, m);
            sort(arr, m+1, r);

        }
    }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();

        int[] arr = {12, 11, 13, 5, 6, 7};
        obj.sort(arr, 0, arr.length - 1);
    }
}

