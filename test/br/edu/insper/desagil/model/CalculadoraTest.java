package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private static double tolerancia = 0.05;
	private CalculadoraCCC calculadora;
	private CalculadoraCFC calculadora2;

	@BeforeEach
	public void setUp() {
		calculadora = new CalculadoraCCC();
		calculadora2 = new CalculadoraCFC();
	}

	@Test
	public void niobioCCC() {
		assertEquals(calculadora.calcula(92.91,0.143),8.57,tolerancia);
	}
	@Test
	public void cobreCFC() {
		assertEquals(calculadora2.calcula(63.55, 0.128),8.89,tolerancia);
	}
	@Test
	public void tungstenioCCC() {
		assertEquals(calculadora.calcula(183.84, 0.137),19.28,tolerancia);
	}
	@Test
	public void ouroCFC() {
		assertEquals(calculadora2.calcula(196.97, 0.144),19.36,tolerancia);
	}
	@Test
	public void litioCCC() {
		assertEquals(calculadora.calcula(6.94, 0.152),0.53,tolerancia);
	}
	@Test
	public void prataCFC() {
		assertEquals(calculadora2.calcula(107.87, 0.144),10.60,tolerancia);
	}
}