package workspace;


public class BuyandSellStock {

	public int maxProfit(int[] prices) {
		int max = 0;
		int buy = 0, sell;

		for(sell = 1; sell < prices.length; ){
			int res = prices[sell] - prices[buy];
			max = Math.max(max, res);
			if(prices[buy] > prices[sell]){
				buy = sell;
			}
			sell++;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		BuyandSellStock obj = new BuyandSellStock();
		int[] prices = {7,2,5,3,6,4,1,9};
		
		System.out.println(obj.maxProfit(prices));

	}

}
