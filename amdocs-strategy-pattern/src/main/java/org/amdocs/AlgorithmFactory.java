package org.amdocs;

public class AlgorithmFactory {
	public static IAlgorithm getAlgo(String algoName)
	
	{
		IAlgorithm algo=null;
		   if(algoName.equals("BubbleSort"))
			   algo=new BubbleSort();
		   else if(algoName.equals("HeapSort"))
			   algo=new HeapSort();
		    if(algoName.equals("QuickSort"))
			   algo=new QuickSort();
		    else
		    	algo=new Nullalgo();
		   return algo;
				   
	}

}
