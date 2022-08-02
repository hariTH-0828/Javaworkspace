package workspace;


public class BuyandSellStock {

	public int maxProfit(int[] prices) {
		int max = 0;
		
		for(int i = 0; i <= prices.length - 2; i++) {
			for(int j = i; j < prices.length; j++) {
				if(prices[i] < prices[j]) {
					if(max < (prices[j] - prices[i])) {
						max = prices[j] - prices[i];
					}
				}
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		BuyandSellStock obj = new BuyandSellStock();
		int[] prices = {1,2};
		
		System.out.println(obj.maxProfit(prices));

	}

}
