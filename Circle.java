
public class Circle 
{
	private double radius;
	
	Circle()
	{
		radius = 0;
	}
	
	public void SetRadius(double setRadius)
	{
		radius = setRadius;
	}
	
	public double GetRadius()
	{
		return radius;
	}
	
	public double CircleArea()
	{
		double CircleArea = Math.PI*(radius*radius);
		return CircleArea;
	}
}
