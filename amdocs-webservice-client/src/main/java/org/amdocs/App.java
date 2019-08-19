package org.amdocs;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

public class App {

	public static void main(String[] args) {
		
		System.setProperty("java.net.useSystemProxies", "true");
		Calculator calculator=new Calculator();
		CalculatorSoap service=calculator.getCalculatorSoap();
		
		int x=100,y=200,result=service.add(x, y);
		System.out.println("result is "+result);
	}
}
