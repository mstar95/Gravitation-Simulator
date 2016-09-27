package model;

public class Model extends Observable
{

	Params params;
	boolean isFirstClickOfMouse;
	Vector mouseVector;
	
	public Model()
	{
		params = new Params();
		isFirstClickOfMouse = true;
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
			params = new Params();
		else
		{
			isFirstClickOfMouse = true;
			createPlanet();
		}
		params.isMousePressed = b;
	}
	
	public void createPlanet()
	{
		createPlanet();
	}
}
