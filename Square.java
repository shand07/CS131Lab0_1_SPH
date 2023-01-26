
public class Square
{
	private double side;
	public Square()
	{
		side = 0;
	}
	
	
	public void SetSide(double squareSide)
	{
		this.side = squareSide;
	}
	
	public double GetSide()
	{
		return side;
	}
	
	public double SquareArea()
	{
		double SquareArea = (side*side);
		return SquareArea;
	}
}
