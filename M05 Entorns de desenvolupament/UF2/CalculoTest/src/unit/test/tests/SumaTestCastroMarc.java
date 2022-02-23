package unit.test.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit.test.classes.SumaCastroMarc;

class SumaTestCastroMarc {

	@Test
	public void test() {
		SumaCastroMarc test = new SumaCastroMarc();
		assertEquals(15,test.suma(10,5), "10+5 tiene que ser 15");
		assertEquals(15,test.suma(5,10), "5+10 tiene que ser 15");
		assertEquals(5,test.suma(0,5), "0+5 tiene que ser 5");
	}

}
