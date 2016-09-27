package controller;

import java.util.ArrayList;

import model.Model;
import model.Observer;
import model.Point;
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
	
	public void update()
	{
		model.update();
	}
	
	public void setView(View view)
	{
		this.view = view;
	}
	
	public void setPositionOfMouse(Point p)
	{
		model.setPositionOfMouse(p);
	}
	
	
	public void setMousePressedFlag(boolean b)
	{
		model.setMousePressedFlag(b);
	}
	
	public int getMass()
	{
		return view.getMass();
	}
	
}
