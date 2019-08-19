package mathApp.amdocs;

import java.util.Scanner;

public class Addition 
{
	public int add(int x,int y)
	{
		return x+y;
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int firstInput=s.nextInt();
		int secondInput=s.nextInt();
		Addition ad1=new Addition();
		int result=ad1.add(firstInput, secondInput);
		System.out.println("result="+result);
	}

}
