package workSpace.src.searching;

// Find Minimum in Rotated Sorted array
public class RotatedSortedArray {

    public int findMin(int[] nums){
        int lb = 0;
        int hb = nums.length - 1;
        int res = nums[0];

        while(lb <= hb){
            if(nums[lb] < nums[hb]){
                res = Math.min(res, nums[lb]);
                break;
            }

            int mid = (lb + hb) / 2;
            res = Math.min(res, nums[mid]);
            if(nums[mid] >= nums[lb]){
                lb = mid + 1;
            }else hb = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(new RotatedSortedArray().findMin(array));
    }
}
