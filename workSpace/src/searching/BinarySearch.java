package workSpace.src.searching;

public class BinarySearch {

    // Without Recursion
    public int search(int[] nums, int target){
        int lowPtr = 0;
        int highPtr = nums.length - 1;

        while(lowPtr <= highPtr){
            int mid = (lowPtr + highPtr) / 2;

            if(target > nums[mid]){
                lowPtr = mid + 1;
            }else if(target < nums[mid]) {
                highPtr = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    // Recursion Search
    public int binarySearch(int[] nums, int lb, int hb, int target){
        int mid = (lb + hb) / 2;
        while(lb < hb){
            if(target == nums[mid]){
                return mid;
            }

            if(nums[mid] > target) {
                return binarySearch(nums, lb, mid - 1, target);
            }else {
                return binarySearch(nums, mid + 1, nums.length, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 8, 12};
        System.out.println("Index of : "+new BinarySearch().binarySearch(nums,0, nums.length, 12));
        System.out.println("Index of : "+new BinarySearch().search(nums, 12));
    }
}
