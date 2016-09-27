package model;

public class Planet extends Point
{
	private int radius;
	private int velocityX, velocityY;
	private int mass;
	public Planet(int x,int y,int vX,int vY,int mass)
	{
		super(x,y);
		this.velocityX = vX;
		this.velocityY = vY;
		this.mass = mass;
	}
}
