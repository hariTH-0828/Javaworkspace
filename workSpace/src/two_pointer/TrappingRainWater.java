package workSpace.src.two_pointer;

public class TrappingRainWater {

    public int trap(int[] height){
        int trapWater = 0;
        int leftPtr = 0;
        int rightPtr = leftPtr + 1;
        int count = 0;
        int barHeight = 0;
        while (leftPtr < rightPtr && rightPtr < height.length){
            if(height[leftPtr] == 0){
                leftPtr += 1;
                rightPtr = leftPtr + 1;
            }else if(height[rightPtr] < height[leftPtr]) {
                count += 1;
                barHeight += height[rightPtr];
                rightPtr++;
            }else {
                int area = count * Math.min(height[leftPtr], height[rightPtr]);
                trapWater += area - barHeight;
                    count = 0;
                    barHeight = 0;
                leftPtr = rightPtr;
                rightPtr = leftPtr + 1;
            }
        }
        return trapWater;
    }
    public static void main(String[] args) {
        int[] heights = {
                0,1,0,2,1,0,1,3,2,1,2,1
        };

        System.out.println(new TrappingRainWater().trap(heights));

    }
}
