package model;

import java.util.ArrayList;

import controller.Controller;

public class Model extends Observable
{
	Controller controller;
	Params params;
	boolean isFirstClickOfMouse;
	Vector mouseVector;
	ArrayList<Planet> planets;
	int actualMass;
	
	public Model()
	{
		params = new Params();
		isFirstClickOfMouse = true;
		planets = new ArrayList<Planet>();
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
		PlanetPhysics.movePlanets(planets);
		PlanetPhysics.calculateGravityEffect(planets);
		System.out.println(planets.size());
		params.setPlanets(planets);
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
		
		Planet planet = new Planet(mouseVector.getA().getX(),
				mouseVector.getA().getY(),
				mouseVector.getXVec(),mouseVector.getYVec(),controller.getMass());
		planets.add(planet);
		params.setPlanets(planets);
		notifyObservers();
	}
	
	
	
}
