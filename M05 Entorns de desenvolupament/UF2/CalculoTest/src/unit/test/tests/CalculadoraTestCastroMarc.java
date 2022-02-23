package unit.test.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import unit.test.classes.CalculadoraCastroMarc;

class CalculadoraTestCastroMarc {
	
	private Object calculadora;

	@BeforeEach
	public void setUp() {
		this.calculadora = new CalculadoraTestCastroMarc();
	}

	@AfterEach
	public void tearDown() {
		this.calculadora = null;
	}

	@Test
	void test() {
		CalculadoraCastroMarc test = new CalculadoraCastroMarc();
		assertEquals(15,test.sumar(10,5), "10+5 tiene que ser 15");
		assertEquals(15,test.sumar(5,10), "5+10 tiene que ser 15");
		assertEquals(0,test.sumar(0,0), "0+0 tiene que ser 0");
		assertEquals(5,test.restar(10,5), "10-5 tiene que ser 5");
		assertEquals(-5,test.restar(5,10), "5-10 tiene que ser -5");
		assertEquals(0,test.restar(0,0), "0-0 tiene que ser 0");
		assertEquals(50,test.multiplicar(10,5), "10*5 tiene que ser 50");
		assertEquals(50,test.multiplicar(5,10), "5*10 tiene que ser 50");
		assertEquals(0,test.multiplicar(0,0), "0*0 tiene que ser 0");
		assertEquals(2,test.dividir(10,5), "10/5 tiene que ser 2");
		assertEquals(5,test.dividir(50,10), "50/10 tiene que ser 5");
	}

}
