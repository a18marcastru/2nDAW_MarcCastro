package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void test() {
		JUnit test = new JUnit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo",result);
	}

}
