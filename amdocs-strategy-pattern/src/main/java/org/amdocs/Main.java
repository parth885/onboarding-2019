package org.amdocs;

import java.util.Scanner;

public class Main {
	
	public  String getChoice() {
		System.out.println("enter your choice");
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
		
	}
	public  void doWork(String choice)
	{
		IAlgorithm algo=AlgorithmFactory.getAlgo(choice);
		algo.sort();
	}
    public static void main(String[] args) {
		
    	Main m=new Main();
    	String choice=m.getChoice();
    	
    	m.doWork(choice);
	}
}
