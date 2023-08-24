package junitTesting.UnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoMinus2eulsto4 {

	@Test
	public void test() {
		
		SimpleCalculator cal = new SimpleCalculator();
		int sub = cal.sub(2, 2);
		
		assertEquals(0, sub);
		//fail("Not yet implemented");
	}

}
