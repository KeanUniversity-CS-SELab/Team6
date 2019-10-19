package edu.kean.se.service;

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public long add(long input1, long input2) {
		return input1+input2;
	}

	@Override
	public long subtract(long input1, long input2) {
		return input1-input2;
	}

	@Override
	public long multiply(long input1, long input2) {
		return input1*input2;
	}

	@Override
	public long divide(long input1, long input2) {
		return input1/input2;
	}
}
