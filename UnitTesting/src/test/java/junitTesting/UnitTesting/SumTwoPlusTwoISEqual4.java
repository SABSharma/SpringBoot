package junitTesting.UnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTwoPlusTwoISEqual4 {

	@Test
	public void test() {
		
		SimpleCalculator cal = new SimpleCalculator();
		int add = cal.add(2, 2);
		assertEquals(4, add);
		
		//fail("Not yet implemented");
	}

}
