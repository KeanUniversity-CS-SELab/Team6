package edu.kean.se.servicetest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.kean.se.service.CalculatorService;
import edu.kean.se.service.CalculatorServiceImpl;

public class CalculatorServiceTester {
	private CalculatorService calculatorService;
	
	@Before
	public void setup() throws Exception {
		calculatorService = new CalculatorServiceImpl();
	}

	@Test
	public void testAdd() {
		assertTrue(calculatorService.add(2l,1l) == 3l);
	}
	
	@Test
	public void testSubtract() {
		assertTrue(calculatorService.subtract(2l, 1l) == 1l);
	}

	@Test
	public void testMultiply() {
		assertTrue(calculatorService.multiply(2l, 1l) == 2l);
	}
	
	@Test
	public void testDivide() {
		assertTrue(calculatorService.divide(2l, 1l) == 2l);
	}
}
