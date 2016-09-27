package model;

public class Params 
{
	private Vector mouseVector;
	public boolean isMousePressed;
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

}
