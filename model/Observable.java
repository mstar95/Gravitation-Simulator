package model;

import java.util.ArrayList;

/*Represents class that can be observed */
public abstract  class Observable 
{
	
	protected ArrayList<Observer> observers; 
	
	public Observable() 
	{
		observers = new ArrayList<Observer>();
	}
	
	abstract void notifyObservers();
	
	
	public void addObserver(Observer o) 
	{
		observers.add(o);
	}
	
	public void removeObserver(Observer o) 
	{
		observers.remove(o);
	}

}
