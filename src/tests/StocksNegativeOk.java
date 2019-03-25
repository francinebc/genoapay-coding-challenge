package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Stocks;

public class StocksNegativeOk {

	Stocks main = new Stocks();
	
	@Test
	public void firstTest() {
		assertEquals(true, true);
	}
	
	@Test
	public void noInput() {
		int[] stockPrices = {};
		assertEquals(0, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void negativeProfit() {
		int[] stockPrices = {10, 9};
		assertEquals(-1, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void profit() {
		int[] stockPrices = {4, 9};
		assertEquals(5, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void standardCase() {
		int[] stockPrices = {10, 7, 5, 8, 11, 9};
		assertEquals(6, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void notHighestSell() {
		int[] stockPrices = {8, 17, 5, 8, 16, 9};
		assertEquals(11, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void notLowestBuy() {
		int[] stockPrices = {13, 17, 5, 8, 16, 4, 15};
		assertEquals(11, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void middleRange() {
		int[] stockPrices = {13, 17, 5, 8, 10, 4, 8};
		assertEquals(5, main.getMaxProfitNegativeOk(stockPrices));
	}
	
}
