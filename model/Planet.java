package model;

import java.awt.Color;

public class Planet extends Point
{
	private Double radius;
	private Double velocityX, velocityY;
	private int mass;
	private boolean collided;

	private final int velocityScale = 1;
	
	public Planet(Double x,Double y,Double vX,Double vY,int mass)
	{
		super(x,y);
		vX/=velocityScale;
		vY/=velocityScale;
		this.setVelocityX(vX);
		this.setVelocityY(vY);
		this.mass = mass;
		calcRadius();
		collided = false;
	}
	
	public void calcRadius()
	{
		if(mass<10)
			radius = 4.0;
		radius = Math.log(mass);
	}
	
	public Double getDoubleRadius()
	{
		return radius;
	}
	
	public int getIntRadius()
	{
		return radius.intValue();
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

	public Double getVelocityX() 
	{
		return velocityX;
	}

	public void setVelocityX(Double velocityX) 
	{
	//	velocityX/=2;
		this.velocityX = velocityX;
	}

	public Double getVelocityY() 
	{
		return velocityY;
	}

	public void setVelocityY(Double velocityY) 
	{
		//velocityY/=2;
		this.velocityY = velocityY;
	}
	
	public int getMass()
	{
		return mass;
	}

	public void setMass(int mass) 
	{
		this.mass = mass;
		calcRadius();
	}
	
	public void setCollided(boolean b)
	{
		collided = b;
	}
	
	public boolean isCollided()
	{
		return collided;
	}
	
}
