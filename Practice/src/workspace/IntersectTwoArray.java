package workspace;

import java.util.Arrays;

public class IntersectTwoArray {

    public int[] intersect(int[] nums1, int[] nums2) {
        int i, j = 0, k = 0;
        int count = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Find the no.of elements are intersect
        for(i = 0; i < nums1.length; ){
            if(nums1[i] == nums2[j]){
                count += 1;
                k++;i++;j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }
        }

        int[] result = new int[count]; j = 0; k = 0;
        for(i = 0; i < nums1.length; ){
            if(nums1[i] == nums2[j]){
                result[k] = nums1[i];
                k++;i++;j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }else{
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        IntersectTwoArray obj = new IntersectTwoArray();

        int[] arr1 = {1,2};
        int[] arr2 = {1,1};

        int[] result = obj.intersect(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
