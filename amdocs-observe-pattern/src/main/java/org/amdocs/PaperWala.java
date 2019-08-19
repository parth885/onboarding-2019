package org.amdocs;

import java.util.ArrayList;

public class PaperWala implements IObserve{
	private ArrayList <IObserver> subscribers;
	

	public PaperWala(String name)
	{
		subscribers=new ArrayList<IObserver>();
	}
	public void addSubscriber(IObserver observer) {
		// TODO Auto-generated method stub
		
		subscribers.add(observer);
	}

	public void removeSubscriber(IObserver observer) {
		// TODO Auto-generated method stub
		subscribers.remove(observer);
	}

	public void modifyAllSubscriber(String message) {
		// TODO Auto-generated method stub
		
	}

}
