package org.amdocs;

public interface IObserve {
    public void addSubscriber(IObserver observer);
    public void removeSubscriber(IObserver observer);
    public void modifyAllSubscriber(String message);
    
}
