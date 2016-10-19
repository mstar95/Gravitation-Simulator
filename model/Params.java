package model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedList;



public class Params 
{
	
	private Vector mouseVector;
	public boolean isMousePressed;
	private LinkedList<Planet> planets;
	private LinkedList<Mark> paths;

	public Params()
	{
		mouseVector = new Vector();
		isMousePressed = false;
	}
	
	public Vector getMouseVector() 
	{
		return mouseVector;
	}

	public void setMouseVector(Vector mouseVector) 
	{
		this.mouseVector = mouseVector;
	}
	
	public LinkedList<Planet> getPlanets() 
	{
		return planets;
	}

	public void setPlanets(LinkedList<Planet> planets) 
	{
		this.planets = planets;
	}
	
	public void setPaths(LinkedList<Mark> paths ) 
	{
		this.paths = paths;
	}
	
	public LinkedList<Mark> getPaths( ) 
	{
		return paths;
	}
}
