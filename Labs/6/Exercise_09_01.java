
public class Exercise_09_01
{
	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("\n Rectangle 1 -->");
		System.out.println("Width :: " + rect1.width);
		System.out.println("Height :: " + rect1.height);
		System.out.println("Area :: " + rect1.getArea());
		System.out.println("Perimeter :: " + rect1.getPerimeter());

		System.out.println("\n Rectangle 1 -->");
		System.out.println("Width :: " + rect2.width);
		System.out.println("Height :: " + rect2.height);
		System.out.println("Area :: " + rect2.getArea());
		System.out.println("Perimeter :: " + rect2.getPerimeter());

	}
}