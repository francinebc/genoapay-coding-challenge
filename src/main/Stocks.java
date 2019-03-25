package main;

public class Stocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getMaxProfitNegativeOk(int[] stockPrices) {
		if(stockPrices.length == 0) return 0;
		int best = Integer.MIN_VALUE;
		for(int i=0; i<stockPrices.length; i++) {
			for(int j=i+1; j<stockPrices.length; j++) {
				if(stockPrices[j]-stockPrices[i]>best) best = stockPrices[j]-stockPrices[i];
			}
		}		
		return best;
	}
	
	public int getMaxProfitEfficient(int[] stockPrices) {
		if(stockPrices.length == 0) return 0;
		int max = 0;
		int best = 0;
		for(int i=stockPrices.length-1; i>=0; i--) {
			if(stockPrices[i] > max) max = stockPrices[i];
			if(max - stockPrices[i] > best) best = max - stockPrices[i];
		}		
		return best;
	}

}
