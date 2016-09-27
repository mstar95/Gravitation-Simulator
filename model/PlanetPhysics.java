package model;

public class PlanetPhysics
{
	public static void move(Planet p)
	{
		p.setX(p.getX() + p.getVelocityX());
		p.setY(p.getY() + p.getVelocityY());
	}
	
}
