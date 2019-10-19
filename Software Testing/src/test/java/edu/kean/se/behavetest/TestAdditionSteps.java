package edu.kean.se.behavetest;

import edu.kean.se.app.MathApplication;
import edu.kean.se.service.CalculatorService;
import edu.kean.se.service.CalculatorServiceImpl;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertTrue;

public class TestAdditionSteps {
	private MathApplication mathApp;
	private long additionResult;
	
	@Given("A Math Application")
	public void setupMathApplication(){
		mathApp = new MathApplication();
	}
	
	@Given("A Calculator service")
	public void setupCalculatorService(){
		CalculatorService calcService = new CalculatorServiceImpl();
		mathApp.setCalculatorService(calcService);
	}
	
	@When("I add two numbers ($arg1, $arg2)")
	public void testAddition(long arg1, long arg2) {
		additionResult = mathApp.add(arg1, arg2);
	}
	
	@Then("The result will be equal to $result")
	public void validate(long result) {
		assertTrue(additionResult == result);
	}
	
}
