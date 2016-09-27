package model;
/*representation of pair of points*/
public class Vector 
{
	Point a;
	Point b;
	
	public Vector()
	{
		this.a = new Point();
		this.b = new Point();
	}
	
	public Vector(Point a, Point b)
	{
		this.a = a;
		this.b = b;
	}
	
	public Point getA() 
	{
		return a;
	}
	public void setA(Point a) 
	{
		this.a = a;
	}
	public Point getB() 
	{
		return b;
	}
	public void setB(Point b) 
	{
		this.b = b;
	}
}