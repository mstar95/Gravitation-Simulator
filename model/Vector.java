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
	
	public int getLength()
	{
		return new Double(Math.sqrt(Math.pow(a.x - b.x,2) + Math.pow(a.y - b.y,2))).intValue();
	}
	
	public Double getDoubleXVec()
	{
		return (b.x - a.x);
	}
	
	public Double getDoubleYVec()
	{
		return (b.y - a.y);
	}
	
	public Integer getIntXVec()
	{
		return new Double(b.x - a.x).intValue();
	}
	
	public Integer getIntYVec()
	{
		return  new Double(b.y - a.y).intValue();
	}

	
}