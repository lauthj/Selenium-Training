package com.tests;

public class CalculatorImpl implements Calculator {
	
	static private int result;
	
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		
		CalculatorImpl.setResult(x + y);

	}

	public void subtract(int x, int y) {
		// TODO Auto-generated method stub
		
		CalculatorImpl.setResult(x - y);

	}

	public void multiply(int y, int y2) {
		// TODO Auto-generated method stub
		
		CalculatorImpl.setResult(y * y2);

	}

	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		
		CalculatorImpl.setResult(x / y);

	}

	public static int getResult() {
		return result;
	}

	public static void setResult(int result) {
		CalculatorImpl.result = result;
	}

}
