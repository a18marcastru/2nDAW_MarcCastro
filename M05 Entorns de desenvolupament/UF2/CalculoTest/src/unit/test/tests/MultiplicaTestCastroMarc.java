package unit.test.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import unit.test.classes.MultiplicaCastroMarc;

public class MultiplicaTestCastroMarc {
	
	@Test
	public void test() {
		MultiplicaCastroMarc test = new MultiplicaCastroMarc();
		assertEquals(50,test.multiply(10,5), "10*5 tiene que ser 50");
		assertEquals(50,test.multiply(5,10), "5*10 tiene que ser 50");
		assertEquals(0,test.multiply(0,5), "0*5 tiene que ser 0");
	}

}
