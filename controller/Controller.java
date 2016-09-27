package controller;

import java.util.ArrayList;

import model.Model;
import model.Observer;
import view.View;

public class Controller 
{
	Model model;
	View view;
	public Controller(Model model)
	{
		this.model = model; 
	}
	
	public void setupObservers( ArrayList<Observer> observers)
	{
		for (Observer o : observers) 
		{
			model.addObserver(o);
		}
	}
	
	
	public void setView(View view)
	{
		this.view = view;
	}
	
	
}
