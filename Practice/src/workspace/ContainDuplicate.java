package workspace;
import java.util.HashMap;

public class ContainDuplicate {

   /* public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }*/

    public boolean containsDuplicate(int[] nums){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, 1);
            } else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainDuplicate obj = new ContainDuplicate();

        int[] nums = {1,2,3,4,5,1};
        System.out.println(obj.containsDuplicate(nums));
    }
}
