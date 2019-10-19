package edu.kean.se.apptest;
import edu.kean.se.app.MathApplication;
import edu.kean.se.service.CalculatorService;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(calcService.add(10l, 20l)).thenReturn(30l);
		
      //test the add functionality
      Assert.assertEquals(30l, mathApplication.add(10l, 20l));
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testDivide(){
      //add the behavior of calc service to add two numbers
      when(calcService.divide(10l, 0l)).thenThrow(new IllegalArgumentException("divisor's value is 0"));
		
      //test the add functionality
      long retVal = mathApplication.divide(10l, 0l);
   }
}