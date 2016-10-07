package model;

import java.awt.Color;
import java.util.ArrayList;

import controller.Controller;

public class Model extends Observable
{
	private final int B_WIDTH = 1200;
	private final int B_HEIGHT = 600;
	Controller controller;
	Params params;
	Vector mouseVector;
	ArrayList<Planet> planets;
	private Color[][] paths ;
	int actualMass;
	boolean isFirstClickOfMouse;
	boolean shouldMove;
	
	
	public Model()
	{
		params = new Params();
		isFirstClickOfMouse = true;
		planets = new ArrayList<Planet>();
		shouldMove = true;
		paths = new Color[B_WIDTH][B_HEIGHT];
	}
	
	public void setController(Controller c)
	{
		 controller = c;
	}
	public Params getParams()
	{
		return params;
	}

	@Override
	protected void notifyObservers() 
	{
		for (Observer o : observers) 
		{
			o.update(params);
		}
		
	}
	
	public void update()
	{
		if(!shouldMove)
			return;
		PlanetPhysics.movePlanets(planets);
		PlanetPhysics.calculateGravityEffect(planets);
		params.setPlanets(planets);
		updatePaths();
		notifyObservers();
	}
	
	public void setPositionOfMouse(Point p)
	{
		if(isFirstClickOfMouse)
		{
			mouseVector = new Vector(p,p);
			isFirstClickOfMouse = false;
		}
		else
		{
			mouseVector.setB(p);
		}
		params.setMouseVector(mouseVector);
		notifyObservers();
	}
	
	public void setMousePressedFlag(boolean b)
	{
		if(b)
			params.setMouseVector(new Vector());
		else
		{
			isFirstClickOfMouse = true;
			createPlanet();
		}
		params.isMousePressed = b;
	}
	
	public void setMass(int m)
	{
		actualMass = m;
	}
	
	
	public void createPlanet()
	{
		
		Planet planet = new Planet(mouseVector.getA().getDoubleX(),
				mouseVector.getA().getDoubleY(),
				mouseVector.getDoubleXVec(),mouseVector.getDoubleYVec(),controller.getMass());
		planets.add(planet);
		params.setPlanets(planets);
		notifyObservers();
	}
	
	public void clearPlanets()
	{
		planets.clear();
		params.setPlanets(planets);
		notifyObservers();
	}
	
	public void switchPlanetsMove(boolean b)
	{
		shouldMove = b;
	}
	
	private void updatePaths()
	{
		for(Planet p: planets)
		{
			try{
				paths[p.getIntX()][p.getIntY()] = p.getType();
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}
		params.setPaths(paths);
	}
	
}
