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
	public void oneInput() {
		int[] stockPrices = {10};
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
	
	@Test
	public void noDifference() {
		int[] stockPrices = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		assertEquals(0, main.getMaxProfitNegativeOk(stockPrices));
	}
	
	@Test
	public void longStockList() {
		int[] stockPrices = {
				7,	35,	72,	24,	59,
				40,	39,	19,	99,	2,
				49,	66,	67,	73,	87,
				89,	89,	27,	13,	92,
				55,	69,	22,	77,	91,
				71,	38,	46,	23,	58,
				55,	17,	11,	60,	28,
				9,	77,	95,	56,	1,
				83,	100,11,	38,	32,
				94,	56,	4,	83,	45,
				22,	73,	1,	53,	7,
				38,	10,	55,	15,	13,
				46,	60,	18,	84,	98,
				91,	64,	30,	30,	33,
				89,	45,	76,	10,	54,
				11,	27,	24,	44,	73,
				15,	99,	48,	37,	88,
				38,	50,	71,	75,	89,
				54,	35,	81,	86,	96,
				47,	88,	70,	94,	16
		};
		assertEquals(99, main.getMaxProfitNegativeOk(stockPrices));
	}
	
}
