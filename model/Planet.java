package model;

import java.awt.Color;

public class Planet extends Point
{
	private int radius;
	private int velocityX, velocityY;
	private int mass;
	private final int velocityScale = 20;
	
	public Planet(int x,int y,int vX,int vY,int mass)
	{
		super(x,y);
		vX/=velocityScale;
		vY/=velocityScale;
		this.setVelocityX(vX);
		this.setVelocityY(vY);
		this.mass = mass;
	}
	
	public int getRadius()
	{
		if(mass<10)
			return 4;
		return new Double(Math.log(mass)).intValue();
	}
	
	public Color getType()
	{
		if (mass<10000)
			return Color.WHITE;
		else if(mass<100000)
			return Color.YELLOW;
		else if(mass<1000000)
			return Color.ORANGE;
		return Color.RED;
	}

	public int getVelocityX() 
	{
		return velocityX;
	}

	public void setVelocityX(int velocityX) 
	{
		this.velocityX = velocityX;
	}

	public int getVelocityY() 
	{
		return velocityY;
	}

	public void setVelocityY(int velocityY) 
	{
		this.velocityY = velocityY;
	}
	
	
}
