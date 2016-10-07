package model;

import java.util.ArrayList;
import java.util.Iterator;

public class PlanetPhysics
{
	private static ArrayList<Planet> newPlanets = new ArrayList<Planet>();
	private static int Border = 1500;
	public static void movePlanets(ArrayList<Planet>  planets)
	{
		for(Planet p : planets)
		{
			PlanetPhysics.move(p);
		}
		checkBorders(planets);
	}
	
	public static void move(Planet p)
	{
		p.setX(p.getDoubleX() + p.getVelocityX()/50);
		p.setY(p.getDoubleY() + p.getVelocityY()/50);
		
			
	}
	
	public static void checkBorders(ArrayList<Planet>  planets)
	{
		for (Iterator<Planet> iterator = planets.iterator(); iterator.hasNext();) 
		{
			Planet p = iterator.next();
		    if(p.getIntX() > Border || p.getIntX()  < 0 ||
		    		p.getIntY() > Border ||  p.getIntY()  < 0)		    
		    {
		        iterator.remove();
		    }
		}
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
				
				if(radius < mainPlanet.getDoubleRadius() + otherPlanet.getDoubleRadius()/1.5)
				{
					Planet planet = new Planet(( mainPlanet.getDoubleX()+otherPlanet.getDoubleX())/2,
							(( mainPlanet.getDoubleY()+otherPlanet.getDoubleY())/2),
							((mainPlanet.getVelocityX()*mainPlanet.getMass()+otherPlanet.getVelocityX()*otherPlanet.getMass())/(mainPlanet.getMass()+otherPlanet.getMass())),
							((mainPlanet.getVelocityY()*mainPlanet.getMass()+otherPlanet.getVelocityY()*otherPlanet.getMass())/(mainPlanet.getMass()+otherPlanet.getMass())),
							mainPlanet.getMass()+otherPlanet.getMass());
					newPlanets.add(planet);
					mainPlanet.setCollided(true);
					otherPlanet.setCollided(true);
				}
				xDist = otherPlanet.getDoubleX() -  mainPlanet.getDoubleX();
				yDist = otherPlanet.getDoubleY() -  mainPlanet.getDoubleY();
				
				vel = otherPlanet.getMass()/(radius*radius);
				
				mainPlanet.setVelocityX(mainPlanet.getVelocityX()+ 
						(vel*xDist/(radius*1)));
				mainPlanet.setVelocityY(mainPlanet.getVelocityY()+ 
						vel*yDist/(radius*1));
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
	}
	
}
