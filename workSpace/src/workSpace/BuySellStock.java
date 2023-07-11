package workSpace;

public class BuySellStock {

	public int maxProfit(int[] nums) {
		int profit = 0;
		for (int i = 0, j = 1; i < nums.length - 1 && j < nums.length;) {
			if (nums[i] > nums[j]) {
				i = j;
			}else {
				profit = Math.max(profit, nums[j] - nums[i]);
			}
			j++;
		}
		
		return profit;
	}

	public static void main(String args[]) {
		int[] cost = { 2, 7, 1, 5, 3, 6, 4 };
		BuySellStock buySellStock = new BuySellStock();
		int profit = buySellStock.maxProfit(cost);
		System.out.println(profit);
	}
}
