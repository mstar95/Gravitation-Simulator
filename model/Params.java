package model;

import java.awt.Color;
import java.util.ArrayList;



public class Params 
{
	
	private Vector mouseVector;
	public boolean isMousePressed;
	private ArrayList<Planet> planets;
	private Color[][] paths ;

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
	
	public void setPaths(Color[][] paths ) 
	{
		this.paths = paths;
	}
	
	public Color[][] getPaths( ) 
	{
		return paths;
	}
}
