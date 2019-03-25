package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Stocks;

public class StockTests {
	
	@Test
	public void firstTest() {
		assertEquals(true, true);
	}
	
	@Test
	public void standardCase() {
		Stocks main = new Stocks();
		int[] stockPrices = {10, 7, 5, 8, 11, 9};
		assertEquals(6, main.getMaxProfit(stockPrices));
	}
	
}
