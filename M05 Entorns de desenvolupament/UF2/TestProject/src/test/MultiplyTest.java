package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		JUnit test = new JUnit();
		int result = test.multiply(3, 4);
		assertEquals(12,result);
	}

}
