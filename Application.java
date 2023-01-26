
public class Application 
{

	public static void main(String[] args) 
	{
		Square mySquare = new Square();
		mySquare.SetSide(2);
		mySquare.GetSide();
		System.out.println("The Area of your square is: " +mySquare.SquareArea());
	
		
		Circle myCircle = new Circle();
		myCircle.SetRadius(1);
		myCircle.GetRadius();
		System.out.println("The area of your circle is: " +myCircle.CircleArea());
		
		
	}

}
