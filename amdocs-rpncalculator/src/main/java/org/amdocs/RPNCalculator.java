package org.amdocs;

import java.util.Stack;

public class RPNCalculator {
	
	private Stack<Double> numberStack;
	private double firstNumber,secondNumber,result=0;
	
	public RPNCalculator()
	{
		numberStack=new Stack<Double>();
		firstNumber=secondNumber=result=0.0;
	}
	
	
	public double evaluate(String rpnMathExpression) {
		// TODO Auto-generated method stub
		String[] rpnTokens=rpnMathExpression.split(" ");
		
		IMathOperation mathOperation=null;
		for(String token : rpnTokens)
		{
			if(isMathOperator(token))
			{
				extractInputs();
				mathOperation=mathFactory.getObject(token);
				result=mathOperation.evaluate(firstNumber,secondNumber);
				numberStack.push(result);
			}
			else
				numberStack.push(Double.parseDouble(token));
		}

		return numberStack.pop();
	}
	
	
	private boolean isMathOperator(String token) {
		// TODO Auto-generated method stub
		String mathOperators="+-*";
		return mathOperators.contains(token);
	}
	
	private void multiply() {
		extractInputs();
		result=firstNumber * secondNumber;
		numberStack.push(result);
	}


	private void subtract() {
		extractInputs();
		result=firstNumber - secondNumber;
		numberStack.push(result);
	}


	private void addition() {
		extractInputs();
		result=firstNumber + secondNumber;
		numberStack.push(result);
	}


	private void extractInputs() {
		firstNumber=numberStack.pop();
		secondNumber=numberStack.pop();
	}

}
