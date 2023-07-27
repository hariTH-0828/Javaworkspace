package workSpace.src.two_pointer;

public class ContainsWithMostWater {

    public int maxArea(int[] height){
        int max_area = 0;
        int leftPtr = 0;
        int rightPtr = height.length - 1;
        while(leftPtr < rightPtr){
            int area = (rightPtr - leftPtr) * Math.min(height[rightPtr], height[leftPtr]);
            max_area = Math.max(max_area, area);
            if(height[leftPtr] <= height[rightPtr]){
                leftPtr++;
            }else {
                rightPtr--;
            }
        }
        return max_area;
    }
    public static void main(String[] args) {
        int[] heights = {
                1,8,6,2,5,9,8,3,7
        };

        System.out.println(new ContainsWithMostWater().maxArea(heights));

    }
}
