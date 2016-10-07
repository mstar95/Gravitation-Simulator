package model;
/*representation of single point*/
public class Point 
{
	Double x,y;

	public Point()
	{

	}
	
	public Point(Double x,Double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point(int x,int y)
	{
		this.x = new Double(x);
		this.y = new Double(y);
	}
	
	public Double getDoubleX() 
	{
		return x;
	}
	
	public int getIntX() 
	{
		return x.intValue();
	}

	public void setX(Double x) 
	{
		this.x = x;
	}
	
	public Double getDoubleY()
	{
		return y;
	}
	
	public int getIntY()
	{
		return y.intValue();
	}

	public void setY(Double y) 
	{
		this.y = y;
	}
	
	public double getDistance(Point p)
	{
		return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
	}
	
}
