package test;

import main.Calculator;

import org.junit.Before;

import static org.junit.Assert.*;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

	private Calculator classUnderTest;

	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}

	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}

	@Test
	public void test1() throws Exception {
		System.out.println("Metoda testowa");

		double a = 20;
		double b = 10;

		double wynik = classUnderTest.sum(a, b);
		assertEquals(30, wynik, 0.001);

	}

	@Test
	public void testSumowanieTrzech() throws Exception {
		double a = 2.5;
		double b = 1.5;
		double c = 3.2;
		double wynik = classUnderTest.sum(a, classUnderTest.sum(b, c));

		assertEquals(7.2, wynik, 0.001);
	}

	@Test(expected=Exception.class)

	public void testLiczbzDzielenia() throws Exception {
		double a = 10;
		double b = 0;

		double wynik = classUnderTest.divide(a, b);

		assertEquals(0, wynik, 0.001);
	}

	@Test
	public void testLiczbMnozenie() throws Exception {
		double a = 4;
		double b = 5;

		double wynik = classUnderTest.multiply(a, b);

		assertEquals(20, wynik, 0.001);
	}

	@Test

	public void testLiczbOdejmowanie() throws Exception {
		double a = 10;
		double b = 4;

		double wynik = classUnderTest.subtract(a, b);

		assertEquals(6, wynik, 0.001);
	}

}
