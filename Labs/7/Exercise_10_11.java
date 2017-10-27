
public class Exercise_10_11
{
	public static void main(String[] args)
	{
		Circle2D_10_11 c = new Circle2D_10_11(2, 2, 5.5);

		System.out.println("Circle area :: " + c.getArea()); 
		System.out.println("Circle perimeter :: " + c.getPerimeter()); 
		System.out.println("Does circle contain the point (3, 3)? " + c.contains(3, 3)); 
		System.out.println("Does the circle contain the circle centered at (4, 5) and radius 10.5? " + c.contains(new Circle2D_10_11(4, 5, 10.5)));
		System.out.println("Does the circle overlap the circle centered at (3, 5) and radius 2.3? " + c.overlaps(new Circle2D_10_11(3, 5, 2.3)));
	}
}