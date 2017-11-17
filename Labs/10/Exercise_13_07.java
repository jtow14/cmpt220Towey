
public class Exercise_13_07
{
	public static void main(String[] args)
	{
		GeometricObject[] squareList = {
				new Square(2.3),
				new Square(15),
				new Square(10),
				new Square(8),
				new Square(4.9)
				};
    
		for (int i = 0; i < squareList.length; i++)
		{
			System.out.println("Square Number: " + (i + 1));
			System.out.println("Area of Square: " + squareList[i].getArea());
			System.out.println("HowToColor: " + ((Square)squareList[i]).howToColor());
			System.out.println(" ");
		}
	}
}