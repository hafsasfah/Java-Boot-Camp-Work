package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class StockTest {

	@Test
	public void testGetName() {
		
		Stock test = new Stock("BlairLLC");		
		assertEquals(test.getName(),"BlairLLC");	
	}

	@Test
	public void testGetTicker() {
		Stock test = new Stock("BLLC", "BlairLLC");
		assertEquals(test.getTicker(), "BLLC");
	}

	@Test
	public void testGetPrice() {
		Stock test = new Stock("100");
		assertEquals(test.getPrice(), "100");
	}

}
