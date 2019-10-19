package edu.kean.se.app;
import edu.kean.se.service.CalculatorService;

public class MathApplication {
	   private CalculatorService calcService;

	   public void setCalculatorService(CalculatorService calcService){
	      this.calcService = calcService;
	   }
	   
	   public long add(long input1, long input2){
	      return calcService.add(input1, input2);
	   }
	   
	   public long subtract(long input1, long input2){
	      return calcService.subtract(input1, input2);
	   }
	   
	   public long multiply(long input1, long input2){
	      return calcService.multiply(input1, input2);
	   }
	   
	   public long divide(long input1, long input2){
	      return calcService.divide(input1, input2);
	   }
}
