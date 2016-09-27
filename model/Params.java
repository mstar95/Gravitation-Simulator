package model;

import java.util.ArrayList;

public class Params 
{
	private Vector mouseVector;
	public boolean isMousePressed;
	ArrayList<Planet> planets;
	

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
	
	public ArrayList<Planet> getPlanets() 
	{
		return planets;
	}

	public void setPlanets(ArrayList<Planet> planets) 
	{
		this.planets = planets;
	}

}
