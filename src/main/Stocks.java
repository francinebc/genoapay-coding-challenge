package main;

import java.util.Arrays;
import java.util.Scanner;

public class Stocks {

	public static void main(String[] args) {
		readStockPrices();
	}
	
	public static void readStockPrices() {
	    System.out.println("Please enter your stock prices seperated by [space]");
	    Scanner scanner = new Scanner(System.in);
	    try{
			int[] stockPrices = Arrays.stream(scanner.nextLine().split(" "))
		    	    .mapToInt(i -> Integer.parseInt(i))
		    	    .toArray();
			System.out.println("Your maximum profit is: " + getMaxProfit(stockPrices));	    
	    }catch(NumberFormatException e) {
	    	System.out.println("Please enter only numerical values");
	    	readStockPrices();
	    }
	   
	}
	
	/**
	 * This method will return the best profit.
	 * This method will return 0 if you cannot make positive profit.
	 * 
	 * @param int[] stockPrices
	 * @return int bestProfit
	 */	
	public static int getMaxProfit(int[] stockPrices) {
		if(stockPrices.length <= 1) return 0;
		int min = Integer.MAX_VALUE;
		int best = 0;
		for(int i=0; i<stockPrices.length; i++) {
			if(stockPrices[i] < min) min = stockPrices[i];
			if(stockPrices[i] - min > best) best = stockPrices[i] - min;
		}		
		return best;
	}
	
	/**
	 * This method will return the best profit even if it negative.
	 * This method is less efficient than the main function used.
	 * 
	 * @param int[] stockPrices
	 * @return int bestProfit
	 */
	public static int getMaxProfitNegativeOk(int[] stockPrices) {
		if(stockPrices.length <= 1) return 0;
		int best = Integer.MIN_VALUE;
		for(int i=0; i<stockPrices.length; i++) {
			for(int j=i+1; j<stockPrices.length; j++) {
				if(stockPrices[j]-stockPrices[i]>best) best = stockPrices[j]-stockPrices[i];
			}
		}		
		return best;
	}

}
