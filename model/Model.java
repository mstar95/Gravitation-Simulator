package model;

public class Model extends Observable
{

	Params params;
	
	public Model()
	{
		params = new Params();
	}
	
	public Params getParams()
	{
		return params;
	}

	@Override
	void notifyObservers() 
	{
		for (Observer o : observers) 
		{
			o.update(params);
		}
		
	}
}
