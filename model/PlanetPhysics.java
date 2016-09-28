package model;

import java.util.ArrayList;
import java.util.Iterator;

public class PlanetPhysics
{
	private static ArrayList<Planet> newPlanets = new ArrayList<Planet>();
	public static void movePlanets(ArrayList<Planet>  planets)
	{
		for(Planet p : planets)
		{
			PlanetPhysics.move(p);
		}
	}
	
	public static void move(Planet p)
	{
		p.setX(p.getX() + p.getVelocityX());
		p.setY(p.getY() + p.getVelocityY());
	}
	
	public static void calculateGravityEffect(ArrayList<Planet>  planets)
	{
		if(planets.size()<2) return;
		
		double radius,xDist,yDist,vel;
		
		for(Planet mainPlanet : planets)
		{
			for(Planet otherPlanet : planets)
			{
				if(mainPlanet.equals(otherPlanet) || mainPlanet.isCollided() || otherPlanet.isCollided())
					continue;
				radius = mainPlanet.getDistance(otherPlanet);
				
				if(radius < mainPlanet.getRadius() + otherPlanet.getRadius()/1.5)
				{
					Planet planet = new Planet(( mainPlanet.getX()+otherPlanet.getX())/2,
							(( mainPlanet.getY()+otherPlanet.getY())/2),
							((mainPlanet.getVelocityX()*mainPlanet.getMass()+otherPlanet.getVelocityX()*otherPlanet.getMass())/(mainPlanet.getMass()+otherPlanet.getMass())),
							((mainPlanet.getVelocityY()*mainPlanet.getMass()+otherPlanet.getVelocityY()*otherPlanet.getMass())/(mainPlanet.getMass()+otherPlanet.getMass())),
							mainPlanet.getMass()+otherPlanet.getMass());
					newPlanets.add(planet);
					mainPlanet.setCollided(true);
					otherPlanet.setCollided(true);
				}
				xDist = otherPlanet.getX() -  mainPlanet.getX();
				yDist = otherPlanet.getY() -  mainPlanet.getY();
				
				vel = otherPlanet.getMass()/(radius*radius);
				
				mainPlanet.setVelocityX(mainPlanet.getVelocityX()+ 
						(new Double(vel*xDist/radius).intValue()));
				mainPlanet.setVelocityY(mainPlanet.getVelocityY()+ 
						(new Double(vel*yDist/radius).intValue()));
			}
		}
		
		
		
		for (Iterator<Planet> iterator = planets.iterator(); iterator.hasNext();) 
		{
			Planet p = iterator.next();
		    if (p.isCollided()) 
		    {
		        // Remove the current element from the iterator and the list.
		        iterator.remove();
		    }
		}
		System.out.println(planets.size());
		planets.addAll(newPlanets);
		newPlanets.clear();
		System.out.println("heh");
		System.out.println(planets.size());
	}
	
}
