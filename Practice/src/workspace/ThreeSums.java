package workspace;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSums {

    public ArrayList<Integer> threeSum(int[] nums) {

        Arrays.sort(nums);

        int currentPos, leftPt;

        ArrayList<Integer> result = new ArrayList<>();

        for(currentPos = 0; currentPos < nums.length; currentPos++){
            int rightPt = nums.length - 1;
            for(leftPt = currentPos + 1; leftPt < rightPt; ){
                int sum = nums[currentPos] + nums[leftPt] + nums[rightPt];

                if(sum == 0){
                    result.add(nums[currentPos]);
                    result.add(nums[leftPt]);
                    result.add(nums[rightPt]);
                    break;
                } else if (sum > 0) {
                    rightPt--;
                } else {
                    leftPt++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ThreeSums obj = new ThreeSums();
        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(obj.threeSum(nums));
    }
}
