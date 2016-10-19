package model;

import java.awt.Color;

public class Mark extends Point
{
	private Color color;
	
	public Mark(Double x,Double y,Color c)
	{
		super(x,y);
		setColor(c);
	}
	
	public Color getColor() 
	{
		return color;
	}
	public void setColor(Color color) 
	{
		this.color = color;
	}

}
