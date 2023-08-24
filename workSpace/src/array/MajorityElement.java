package workSpace.src.array;

import java.util.HashMap;

public class MajorityElement {
    public int majority(int[] nums) {
        int max = nums.length / 2; int maxOccur = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int value = map.get(num) + 1;
                map.put(num, value);
            }
            if(max < map.get(num) && maxOccur < map.get(num)) {
                maxOccur = num;
            }
        }
        System.out.println(map.keySet()+"   "+map.values());
        return maxOccur;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
        System.out.println(new MajorityElement().majority(nums));
    }
}
